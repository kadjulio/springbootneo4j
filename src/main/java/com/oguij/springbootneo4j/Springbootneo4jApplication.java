package com.oguij.springbootneo4j;

import com.oguij.springbootneo4j.model.Population;
import com.oguij.springbootneo4j.model.Position;
import com.oguij.springbootneo4j.repository.PositionRepositoryInterface;
import net.minidev.json.writer.ArraysMapper;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
@EnableNeo4jRepositories
public class Springbootneo4jApplication {

	private final static Logger log = (Logger) LoggerFactory.getLogger(Springbootneo4jApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Springbootneo4jApplication.class, args);
	}

	@Bean
	CommandLineRunner demo(PositionRepositoryInterface positionRepositoryInterface){
		return args -> {
			positionRepositoryInterface.deleteAll();


			List<Population> populationList = Arrays.asList();

		};
	}

}
