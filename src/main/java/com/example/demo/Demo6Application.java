package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class Demo6Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo6Application.class, args);
    }

    // JdbcTemplate을 static으로 선언하여 DemoApplication 클래스에서 사용할 수 있도록 함
    public static JdbcTemplate jdbcTemplate;

    @GetMapping("randomname")
    public String randomname() {
        return "randomname";
    }

    @GetMapping("body")
    public String body() {
        return "body";
    }

	@GetMapping("sqlinserttest")
    public String sqlinserttest() {
		// DemoApplication 클래스의 객체 생성
		DemoApplication demoApplication = new DemoApplication();
		// 데이터 삽입 코드 호출
		demoApplication.insertTestData();
		return "body";
	}

    // 내부 클래스로 정의된 DemoApplication 클래스
    public static class DemoApplication implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            // 테스트를 위해 데이터를 삽입하는 코드
            insertTestData();
        }

        private void insertTestData() {
            String sql = "INSERT INTO your_table_name (column1, column2, column3) VALUES (?, ?, ?)";
            jdbcTemplate.update(sql, "value1", "value2", "value3");
            System.out.println("Data inserted successfully!");
        }
    }
}