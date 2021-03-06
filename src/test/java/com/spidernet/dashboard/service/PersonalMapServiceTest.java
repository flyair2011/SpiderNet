package com.spidernet.dashboard.service;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/spring-mybatis.xml" })
@Transactional
public class PersonalMapServiceTest
{

    @Resource
    PersonalMapService personalMapService;
    
  /*  @Test
    @Rollback(true)
    public void testAddPersonalMap()
    {
        PersonalMap personalMap = new PersonalMap();
        assertTrue(personalMapService.addPersonalMap(personalMap));
    }*/

    @Test
    public void testFetchByEmpId()
    {
        String employeeId = "14f014a655e04b88b10fc5a502fc4986";
        assertNotNull(personalMapService.fetchByEmpId(employeeId));
    }

    /*@Test
    public void testUpdatePersonalMap()
    {
        
    }*/
}
