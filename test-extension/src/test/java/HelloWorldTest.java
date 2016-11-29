import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by hemani on 11/28/16.
 */
@RunWith(Arquillian.class)
public class HelloWorldTest {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class, "test.jar")
                .addClass(TestHello.class);
    }


    @Test
    public void helloWorldTest() {
        TestHello testHello = new TestHello();
        testHello.test();
        //System.out.println("In test;;;;");
    }
}
