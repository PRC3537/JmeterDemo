import com.seling.test.BeanUtil;import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;import org.apache.jmeter.samplers.SampleResult;import org.apache.log4j.spi.LoggerFactory;import sun.rmi.runtime.Log;import java.io.Serializable;/** * @program: BeanShellDemoTwo * @description: * @author: gonghuihui * @create: 2018-08-20 19:18 **/public class BeanUtilTest extends AbstractJavaSamplerClient implements Serializable {    private BeanUtil bu;    public Arguments getDefautParameters(){        Arguments args = new Arguments();    }    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {        return null;    }}