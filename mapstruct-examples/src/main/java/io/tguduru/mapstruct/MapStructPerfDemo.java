package io.tguduru.mapstruct;

import org.mapstruct.factory.Mappers;

/**
 * @author Guduru, Thirupathi Reddy
 * created 2019-07-01
 */
public class MapStructPerfDemo {
    public static void main(String[] args) {
        CustomerDestination customerDestination = new CustomerDestination();
        customerDestination.setId(1l).setFirstName("Bob").setLastName("Smith");
        long start = System.nanoTime();
        CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);
        CustomerSource customerSource = customerMapper.translateToSource(customerDestination);
        long end = System.nanoTime();
        System.out.println(customerSource);
        System.out.println("Time for mapper : " + (end - start) / 1000);


        System.out.println("Loading All Classes ...");
        CustomerMapper customerMapper3 = CustomerMapper.INSTANCE;
        CustomerSource customerSource3 = new CustomerSource();
        System.out.println("Required Classes Loaded");
        long start1 = System.nanoTime();
        CustomerMapper customerMapper1 = new CustomerMapperImpl();
        CustomerSource customerSource1 = customerMapper1.translateToSource(customerDestination);
        long end1 = System.nanoTime();
        System.out.println(customerSource1);
        System.out.println("Plain Object translation : " + (end1 - start1) / 1000);

        long start2 = System.nanoTime();
        CustomerSource customerSource2 = customerMapper.translateToSource(customerDestination);
        long end2 = System.nanoTime();
        System.out.println(customerSource2);
        System.out.println("Mapper Object translation : " + (end2 - start2) / 1000);
    }
}
