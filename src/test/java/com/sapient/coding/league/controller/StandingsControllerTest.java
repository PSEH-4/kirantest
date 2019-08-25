package com.sapient.coding.league.controller;

import static org.junit.Assert.assertNotNull;

import org.hamcrest.Matchers;
import org.hibernate.annotations.Any;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.sapient.coding.league.service.impl.StandingServiceImpl;
import com.sapient.coding.league.vo.Standings;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StandingsController.class)
public class StandingsControllerTest {
	
	@Autowired
	StandingsController controller;
	
	@MockBean
	StandingServiceImpl service;
	
	@Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testStandings() {
		Mockito.when(service.getStandingsByTeam(Mockito.anyInt())).thenReturn(new Standings());
		Standings standing = controller.getStandings(1);
		assertNotNull(standing);
	}

}
