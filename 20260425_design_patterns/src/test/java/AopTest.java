import com.org.StartApp;
import com.org.structure.proxy.aopProxy.DataQuery;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = StartApp.class)
public class AopTest {

    @Resource
    private DataQuery dataQuery;

    @Test
    public void testAop(){
        dataQuery.query("key1");
        dataQuery.query("key1");
        dataQuery.query("key2");
    }
}
