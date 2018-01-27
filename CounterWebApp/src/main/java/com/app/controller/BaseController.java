package com.app.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.BicDetailsDto;
import com.app.api.ResponseDto;

@RestController
@CrossOrigin(maxAge = 1500)
public class BaseController {
	@Autowired JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/getAllBics", method = RequestMethod.GET)
	public ResponseEntity<ResponseDto> getAllBics() throws SQLException {
		ResponseDto response = getDataFromDb();
		return new ResponseEntity<ResponseDto>(response, HttpStatus.OK);
	}

	private ResponseDto getDataFromDb() throws SQLException {
		List<BicDetailsDto> bic = jdbcTemplate.query("select * from core.bic_identifier", new RowMapper<BicDetailsDto>() {
			@Override
			public BicDetailsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				BicDetailsDto response = new BicDetailsDto();
				response.setBicCode(rs.getString(1));
				response.setDescription(rs.getString(2));
				return response;
			}
		});
		ResponseDto response = new ResponseDto();
		response.setResponse(bic);
		return response;
	}
}