package io.tguduru.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Guduru, Thirupathi Reddy
 * created 2019-07-01
 */
@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    /**
     * Maps the {@link CustomerDestination} into {@link CustomerSource}
     */

    CustomerSource translateToSource(CustomerDestination customerDestination);

    /**
     * Maps the {@link CustomerSource} into {@link CustomerDestination}
     */

    CustomerDestination translateToDestination(CustomerSource customerSource);
}
