package com.neuedu.his;

import com.neuedu.his.common.util.CaseHistoryIdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CaseHistoryTest {

    @Test
    public void test1(){
        CaseHistoryIdGenerator caseHistoryIdGenerator=new CaseHistoryIdGenerator();
        caseHistoryIdGenerator.gen();
    }
}
