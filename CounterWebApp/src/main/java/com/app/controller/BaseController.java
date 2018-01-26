package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.DbTableDetailsDto;


@RestController
@CrossOrigin(maxAge = 1500)
public class BaseController {
	@RequestMapping(value = "/getDbTableNames", method = RequestMethod.GET)
	public ResponseEntity<DbTableDetailsDto> welcomeName() {
		DbTableDetailsDto response = new DbTableDetailsDto();
		populatesRandomTableNames(response);
		return new ResponseEntity<DbTableDetailsDto>(response, HttpStatus.OK);
	}

	private void populatesRandomTableNames(DbTableDetailsDto response) {
		List<String> value = Arrays.asList("host_summary_by_file_io", "host_summary_by_file_io_type",
				"host_summary_by_stages", "host_summary_by_statement_latency", "host_summary_by_statement_type",
				"innodb_buffer_stats_by_schema");
		response.setTableName(value);
	}
}