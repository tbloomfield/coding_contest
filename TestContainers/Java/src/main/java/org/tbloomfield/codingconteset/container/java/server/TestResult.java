package org.tbloomfield.codingconteset.container.java.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestResult {
	private String testCaseId;
	private Object result;
}