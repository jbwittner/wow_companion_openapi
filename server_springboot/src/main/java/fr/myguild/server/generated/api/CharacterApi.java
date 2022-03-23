/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.myguild.server.generated.api;

import fr.myguild.server.generated.model.CharacterArrayDTO;
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
@Tag(name = "character", description = "the character API")
public interface CharacterApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /character/fetchCharacters : Fetch characters from account
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "fetchCharacters",
        summary = "Fetch characters from account",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CharacterArrayDTO.class)))
        },
        security = {
            @SecurityRequirement(name = "oAuthSample", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/character/fetchCharacters",
        produces = { "application/json" }
    )
    default ResponseEntity<CharacterArrayDTO> fetchCharacters(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"characterDTOs\" : [ { \"mediaMainURL\" : \"mediaMainURL\", \"level\" : 6, \"playableClassDTO\" : { \"mediaURL\" : \"mediaURL\", \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" }, \"playableSpecializationDTOs\" : [ { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"id\" : 7, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"id\" : 7, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } ] }, \"covenantProgressDTO\" : { \"renown_level\" : 1, \"covenantDTO\" : { \"mediaURL\" : \"mediaURL\", \"id\" : 0, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"isActive\" : true, \"playableRaceDTO\" : { \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 6, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"equippedItemLevel\" : 7, \"lastLoginTimestamp\" : 9, \"realmDTO\" : { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"id\" : 2, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"realmCategoryDTO\" : { \"id\" : 4, \"slug\" : \"slug\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\", \"realmTypeDTO\" : { \"id\" : 3, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"name\" : \"name\", \"mediaAvatarURL\" : \"mediaAvatarURL\", \"averageItemLevel\" : 2, \"id\" : 0, \"guildIndexDTO\" : { \"realmDTO\" : { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"id\" : 2, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"realmCategoryDTO\" : { \"id\" : 4, \"slug\" : \"slug\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\", \"realmTypeDTO\" : { \"id\" : 3, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"useApplication\" : true, \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"name\" : \"name\", \"id\" : 5 }, \"userAccountIndexDTO\" : { \"blizzardId\" : 5, \"userName\" : \"userName\" }, \"isFavorite\" : true, \"mediaInsetURL\" : \"mediaInsetURL\" }, { \"mediaMainURL\" : \"mediaMainURL\", \"level\" : 6, \"playableClassDTO\" : { \"mediaURL\" : \"mediaURL\", \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" }, \"playableSpecializationDTOs\" : [ { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"id\" : 7, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"id\" : 7, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } ] }, \"covenantProgressDTO\" : { \"renown_level\" : 1, \"covenantDTO\" : { \"mediaURL\" : \"mediaURL\", \"id\" : 0, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"isActive\" : true, \"playableRaceDTO\" : { \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 6, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"equippedItemLevel\" : 7, \"lastLoginTimestamp\" : 9, \"realmDTO\" : { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"id\" : 2, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"realmCategoryDTO\" : { \"id\" : 4, \"slug\" : \"slug\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\", \"realmTypeDTO\" : { \"id\" : 3, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"name\" : \"name\", \"mediaAvatarURL\" : \"mediaAvatarURL\", \"averageItemLevel\" : 2, \"id\" : 0, \"guildIndexDTO\" : { \"realmDTO\" : { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"id\" : 2, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"realmCategoryDTO\" : { \"id\" : 4, \"slug\" : \"slug\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\", \"realmTypeDTO\" : { \"id\" : 3, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"useApplication\" : true, \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"name\" : \"name\", \"id\" : 5 }, \"userAccountIndexDTO\" : { \"blizzardId\" : 5, \"userName\" : \"userName\" }, \"isFavorite\" : true, \"mediaInsetURL\" : \"mediaInsetURL\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /character/getCharacters : Get characters from account
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getCharacters",
        summary = "Get characters from account",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CharacterArrayDTO.class)))
        },
        security = {
            @SecurityRequirement(name = "oAuthSample", scopes={  })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/character/getCharacters",
        produces = { "application/json" }
    )
    default ResponseEntity<CharacterArrayDTO> getCharacters(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"characterDTOs\" : [ { \"mediaMainURL\" : \"mediaMainURL\", \"level\" : 6, \"playableClassDTO\" : { \"mediaURL\" : \"mediaURL\", \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" }, \"playableSpecializationDTOs\" : [ { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"id\" : 7, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"id\" : 7, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } ] }, \"covenantProgressDTO\" : { \"renown_level\" : 1, \"covenantDTO\" : { \"mediaURL\" : \"mediaURL\", \"id\" : 0, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"isActive\" : true, \"playableRaceDTO\" : { \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 6, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"equippedItemLevel\" : 7, \"lastLoginTimestamp\" : 9, \"realmDTO\" : { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"id\" : 2, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"realmCategoryDTO\" : { \"id\" : 4, \"slug\" : \"slug\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\", \"realmTypeDTO\" : { \"id\" : 3, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"name\" : \"name\", \"mediaAvatarURL\" : \"mediaAvatarURL\", \"averageItemLevel\" : 2, \"id\" : 0, \"guildIndexDTO\" : { \"realmDTO\" : { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"id\" : 2, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"realmCategoryDTO\" : { \"id\" : 4, \"slug\" : \"slug\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\", \"realmTypeDTO\" : { \"id\" : 3, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"useApplication\" : true, \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"name\" : \"name\", \"id\" : 5 }, \"userAccountIndexDTO\" : { \"blizzardId\" : 5, \"userName\" : \"userName\" }, \"isFavorite\" : true, \"mediaInsetURL\" : \"mediaInsetURL\" }, { \"mediaMainURL\" : \"mediaMainURL\", \"level\" : 6, \"playableClassDTO\" : { \"mediaURL\" : \"mediaURL\", \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" }, \"playableSpecializationDTOs\" : [ { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"id\" : 7, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, { \"mediaURL\" : \"mediaURL\", \"playableClassId\" : 2, \"specializationRoleDTO\" : { \"id\" : 7, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 5, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } ] }, \"covenantProgressDTO\" : { \"renown_level\" : 1, \"covenantDTO\" : { \"mediaURL\" : \"mediaURL\", \"id\" : 0, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"isActive\" : true, \"playableRaceDTO\" : { \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 6, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"equippedItemLevel\" : 7, \"lastLoginTimestamp\" : 9, \"realmDTO\" : { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"id\" : 2, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"realmCategoryDTO\" : { \"id\" : 4, \"slug\" : \"slug\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\", \"realmTypeDTO\" : { \"id\" : 3, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"name\" : \"name\", \"mediaAvatarURL\" : \"mediaAvatarURL\", \"averageItemLevel\" : 2, \"id\" : 0, \"guildIndexDTO\" : { \"realmDTO\" : { \"timezone\" : \"timezone\", \"realmRegionDTO\" : { \"id\" : 2, \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"realmCategoryDTO\" : { \"id\" : 4, \"slug\" : \"slug\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"id\" : 9, \"locale\" : \"locale\", \"slug\" : \"slug\", \"realmTypeDTO\" : { \"id\" : 3, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } } }, \"useApplication\" : true, \"factionDTO\" : { \"id\" : 1, \"type\" : \"type\", \"localizedDTO\" : { \"ptBR\" : \"ptBR\", \"zhCN\" : \"zhCN\", \"esES\" : \"esES\", \"ruRU\" : \"ruRU\", \"esMX\" : \"esMX\", \"itIT\" : \"itIT\", \"enUS\" : \"enUS\", \"frFR\" : \"frFR\", \"zhTW\" : \"zhTW\", \"koKR\" : \"koKR\", \"enGB\" : \"enGB\", \"deDE\" : \"deDE\" } }, \"name\" : \"name\", \"id\" : 5 }, \"userAccountIndexDTO\" : { \"blizzardId\" : 5, \"userName\" : \"userName\" }, \"isFavorite\" : true, \"mediaInsetURL\" : \"mediaInsetURL\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
