package io.tguduru.mapstruct;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.io.Serializable;

/**
 * @author Guduru, Thirupathi Reddy
 * created 2019-07-02
 */
public class MappingJMeterTest extends AbstractJavaSamplerClient implements Serializable {
    @Override
    public SampleResult runTest(final JavaSamplerContext javaSamplerContext) {
        SampleResult sampleResult = new SampleResult();
        sampleResult.sampleStart();
        try {
            CustomerSource customerSource = new CustomerSource();
            customerSource.setId(1l).setFirstName("Bob").setLastName("Smith");
            CustomerDestination customerDestination = CustomerMapper.INSTANCE.translateToDestination(customerSource);
            sampleResult.sampleEnd();
            sampleResult.setSuccessful(Boolean.TRUE);
            sampleResult.setResponseCodeOK();
            sampleResult.setSuccessful(true);
        } catch (final Exception ex) {
            sampleResult.sampleEnd();
            sampleResult.setResponseMessage(ex.getMessage());
            sampleResult.setSuccessful(Boolean.FALSE);
        }
        return sampleResult;
    }
}
