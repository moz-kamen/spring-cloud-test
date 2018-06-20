package com.kamen.moz;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kamen.moz.entity.Area;
import com.kamen.moz.repository.AreaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.util.Map;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DataJpaTestApplication {

    @Autowired
    private AreaRepository areaRepository;

    @Test
    public void test(){
        try{
            Map<String, Object> areaMap = getAreaMap();
            for(String key : areaMap.keySet()){
                Map<String, Object> map = (Map<String, Object>)areaMap.get(key);
                for(String subKey : map.keySet()){
                    String value = (String)map.get(subKey);

                    Area area = new Area();
                    area.setId(subKey);
                    area.setAreaName(value);
                    area.setpId(key);
                    areaRepository.save(area);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private Map<String, Object> getAreaMap() throws Exception {
        return new ObjectMapper().readValue(new File("C:\\Users\\xuliang\\Desktop\\pcd.json"), Map.class);
    }
}
