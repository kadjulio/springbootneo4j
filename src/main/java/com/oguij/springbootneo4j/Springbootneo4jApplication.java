package com.oguij.springbootneo4j;
import com.oguij.springbootneo4j.model.Familie;
import com.oguij.springbootneo4j.model.Population;
import com.oguij.springbootneo4j.model.Position;
import com.oguij.springbootneo4j.repository.PositionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
@EnableNeo4jRepositories
public class Springbootneo4jApplication {

	private final static Logger log = LoggerFactory.getLogger(Springbootneo4jApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Springbootneo4jApplication.class, args);
	}

	@Bean
	CommandLineRunner app(PositionRepository positionRepository) {
		return args -> {
			positionRepository.deleteAll();

			Position position0 = new Position("100mN26912E43412", "47.334516712592794", "10.267730388930401");
			Position position1 = new Position("100mN26917E43411", "47.33451345144221", "10.269052504088");
			Position position2 = new Position("100mN26917E43411", ",47.334510174227", "10.2703746190946");
			Position position3 = new Position("100mN26917E43411", "47.334506880947295", "10.2716967339494");
			Position position4 = new Position("100mN26924E43412", "47.334503571602895", "10.267730388930401");
			Position position5 = new Position("100mN26924E43412", "47.334500246194", ",10.274340963200697");
			Position position6 = new Position("100mN26924E43412", "47.334500246194", "10.274340963200697");
			Position position7 = new Position("100mN26924E43412", "47.3344969047206", "10..275663077595803");
			Position position8 = new Position("100mN26924E43412", "47.334493547182504", "10.276985191836099");
			Position position9 = new Position("100mN26926E43410", "47.3344901735799", "10.278307305920901");


			Population population0 = new Population("100mN26912E43412", " INSGESAMT", "Einheiten insgesamt", 10, 0, 0);
			Population population1 = new Population("100mN26917E43411", "INSGESAMT", "Einheiten insgesamt", 10, 0, 0);
			Population population2 = new Population("100mN26917E43411", "ALTER_10JG", "Unter 10", 3, 0, 0);
			Population population3 = new Population("100mN26917E43411", "ALTER_10JG", "50-59", 3, 6, 0);
			Population population4 = new Population("100mN26924E43412", "INSGESAMT", "Einheiten Insgesamt", 6, 0, 0);
			Population population5 = new Population("100mN26924E43412", " ALTER_10JG", "30-39", 3, 4, 0);
			Population population6 = new Population("100mN26924E43412", "ALTER_KURZ", "30-49", 3, 3, 0);
			Population population7 = new Population("100mN26924E43412", "FAMSTND_AUSF", "Ledig", 3, 1, 0);
			Population population8 = new Population("100mN26924E43412", "GEBURTLAND_GRP", "Deutschland", 6, 1, 0);
			Population population9 = new Population("100mN26926E43410", "INSGESAMT", "Einheiten Insgesamt", 4, 0, 0);


			Familie familie0 = new Familie("100mN26912E43412", "INSGESAMT", "Einheiten insgesamt", 3, 0, 0);
			Familie familie1 = new Familie("100mN26917E43411", "INSGESAMT", "Einheiten insgesamt", 3, 0, 0);
			Familie familie2 = new Familie("100mN26917E43411", "FAMGROESS_KLASS", "2 Personen", 3, 1, 0 );
			Familie familie3 = new Familie("100mN26917E43411", "HHTYP_SENIOR_HH", ",Haushalte mit Senioren/-innen und JÃ¼ngeren", 3, 2, 0);
			Familie familie4 = new Familie("100mN26924E43412", "INSGESAMT", "Einheiten insgesamt", 3, 0, 0);
			Familie familie5 = new Familie("100mN26924E43412", "FAMGROESS_KLASS", "2 Personnen", 3, 1, 0);
			Familie familie6 = new Familie("100mN26924E43412", "FAMTYP_KIND", "Alleinerziehende MÃ¼tter alle Kinder ab 18", 3, 13, 0);
			Familie familie7 = new Familie("100mN26924E43412", "HHTYP_SENIOR_HH", "Haushalte ohne Senioren/-innen", 3, 3, 0);
			//Familie familie8 = new Familie("100mN26924E43412");
			Familie familie9 = new Familie("100mN26926E43410", "INSGESAMT", "Einheiten insgeamt",3, 0, 0);


			positionRepository.save(position0);
			positionRepository.save(position1);
			positionRepository.save(position2);
			positionRepository.save(position3);
			positionRepository.save(position4);
			positionRepository.save(position5);
			positionRepository.save(position6);
			positionRepository.save(position7);
			positionRepository.save(position8);
			positionRepository.save(position9);


			position0 = positionRepository.findByPosition(position0.getGitter_ID_100m(), position0.getLatitude(), position0.getLongitude());
			position0.located_at(population0);
			position1 =positionRepository.findByPosition(position1.getGitter_ID_100m(), position1.getLatitude(), position1.getLongitude());
			position1.located_at(population1);
			position2 = positionRepository.findByPosition(position2.getGitter_ID_100m(), position2.getLatitude(), position2.getLongitude());
			position2.located_at(population2);
			position3 =positionRepository.findByPosition(position3.getGitter_ID_100m(), position3.getLatitude(), position3.getLongitude());
			position3.located_at(population3);
			position4 = positionRepository.findByPosition(position4.getGitter_ID_100m(), position4.getLatitude(), position4.getLongitude());
			position4.located_at(population4);
			position5 =positionRepository.findByPosition(position5.getGitter_ID_100m(), position5.getLatitude(), position5.getLongitude());
			position5.located_at(population5);
			position6 = positionRepository.findByPosition(position6.getGitter_ID_100m(), position6.getLatitude(), position6.getLongitude());
			position6.located_at(population6);
			position7 =positionRepository.findByPosition(position7.getGitter_ID_100m(), position7.getLatitude(), position7.getLongitude());
			position7.located_at(population7);
			position8 = positionRepository.findByPosition(position8.getGitter_ID_100m(), position8.getLatitude(), position8.getLongitude());
			position8.located_at(population8);
			position9 =positionRepository.findByPosition(position9.getGitter_ID_100m(), position9.getLatitude(), position9.getLongitude());
			position9.located_at(population9);





			List<Position> location = Arrays.asList(position0,position1,position2,position3,position4,position5,
					position6,position7,position8,position9);
			List<Population> poeplelocation = Arrays.asList(population0,population1,population3,population4,population5,
					population6,population7,population8,population9);
			List<Familie> familielocation = Arrays.asList(familie0,familie1,familie2,familie3,familie4,familie5,
					familie6,familie7,familie9);
			log.info("Lookup each Group by position");
			location.stream().forEach(position -> log.info("\t" + position.toString()));
			poeplelocation.stream().forEach(population -> log.info("\t" + population.toString()));
			familielocation.stream().forEach(familie -> log.info("\t" + familie.toString()));






		};

	}


}
