/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.wowcompanion.openapi.api;

import fr.wowcompanion.openapi.model.StaticDataDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "blizzardData", description = "the blizzardData API")
public interface BlizzardDataApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /blizzardData/getStaticData : Get static localizedData
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getStaticData",
        summary = "Get static localizedData",
        tags = { "Blizzard data" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  StaticDataDTO.class)))
        },
        security = {
            @SecurityRequirement(name = "oAuthSample", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/blizzardData/getStaticData",
        produces = { "application/json" }
    )
    default ResponseEntity<StaticDataDTO> getStaticData(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"covenantDTOs\" : [ { \"mediaURL\" : \"mediaURL\", \"localizedData\" : \"localizedData\", \"id\" : 0 }, { \"mediaURL\" : \"mediaURL\", \"localizedData\" : \"localizedData\", \"id\" : 0 } ], \"factionDTOs\" : [ { \"localizedData\" : \"localizedData\", \"id\" : 1, \"type\" : \"type\" }, { \"localizedData\" : \"localizedData\", \"id\" : 1, \"type\" : \"type\" } ], \"playableClassDTOs\" : [ { \"mediaURL\" : \"mediaURL\", \"localizedData\" : \"localizedData\", \"id\" : 5, \"playableSpecializationDTOs\" : [ { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 7, \"type\" : \"type\" }, \"localizedData\" : \"localizedData\", \"id\" : 5 }, { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 7, \"type\" : \"type\" }, \"localizedData\" : \"localizedData\", \"id\" : 5 } ] }, { \"mediaURL\" : \"mediaURL\", \"localizedData\" : \"localizedData\", \"id\" : 5, \"playableSpecializationDTOs\" : [ { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 7, \"type\" : \"type\" }, \"localizedData\" : \"localizedData\", \"id\" : 5 }, { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 7, \"type\" : \"type\" }, \"localizedData\" : \"localizedData\", \"id\" : 5 } ] } ], \"realmDTOs\" : [ { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 3 }, \"realmCategoryDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 2, \"slug\" : \"slug\" }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\" }, { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 3 }, \"realmCategoryDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 2, \"slug\" : \"slug\" }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\" } ], \"specializationRoleDTOs\" : [ { \"localizedData\" : \"localizedData\", \"id\" : 7, \"type\" : \"type\" }, { \"localizedData\" : \"localizedData\", \"id\" : 7, \"type\" : \"type\" } ], \"playableRaceDTOs\" : [ { \"factionDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 1, \"type\" : \"type\" }, \"localizedData\" : \"localizedData\", \"id\" : 6 }, { \"factionDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 1, \"type\" : \"type\" }, \"localizedData\" : \"localizedData\", \"id\" : 6 } ], \"playableSpecializationDTOs\" : [ { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 7, \"type\" : \"type\" }, \"localizedData\" : \"localizedData\", \"id\" : 5 }, { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"localizedData\" : \"localizedData\", \"id\" : 7, \"type\" : \"type\" }, \"localizedData\" : \"localizedData\", \"id\" : 5 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
