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

@RestController
@CrossOrigin(maxAge = 3600)
public class BaseController {
	@Autowired JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/getAllBics", method = RequestMethod.GET)
	@CrossOrigin(maxAge = 3600)
	public ResponseEntity<List<BicDetailsDto>> getAllBics() throws SQLException {
		List<BicDetailsDto> response = getDataFromDb();
		return new ResponseEntity<List<BicDetailsDto>>(response, HttpStatus.OK);
	}

	private List<BicDetailsDto> getDataFromDb() throws SQLException {
		List<BicDetailsDto> bic = jdbcTemplate.query("select * from core.bic_identifier", new RowMapper<BicDetailsDto>() {
			@Override
			public BicDetailsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				BicDetailsDto response = new BicDetailsDto();
				response.setBicCode(rs.getString(1));
				response.setDescription(rs.getString(2));
				return response;
			}
		});
		return bic;
	}
}