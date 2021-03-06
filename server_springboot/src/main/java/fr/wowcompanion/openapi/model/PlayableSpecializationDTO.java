package fr.wowcompanion.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.wowcompanion.openapi.model.SpecializationRoleDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayableSpecializationDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlayableSpecializationDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("mediaURL")
  private String mediaURL;

  @JsonProperty("playableClassId")
  private Integer playableClassId;

  @JsonProperty("localizedData")
  private String localizedData;

  @JsonProperty("specializationRoleDTO")
  private SpecializationRoleDTO specializationRoleDTO;

  public PlayableSpecializationDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PlayableSpecializationDTO mediaURL(String mediaURL) {
    this.mediaURL = mediaURL;
    return this;
  }

  /**
   * Get mediaURL
   * @return mediaURL
  */
  @NotNull 
  @Schema(name = "mediaURL", required = true)
  public String getMediaURL() {
    return mediaURL;
  }

  public void setMediaURL(String mediaURL) {
    this.mediaURL = mediaURL;
  }

  public PlayableSpecializationDTO playableClassId(Integer playableClassId) {
    this.playableClassId = playableClassId;
    return this;
  }

  /**
   * Get playableClassId
   * @return playableClassId
  */
  @NotNull 
  @Schema(name = "playableClassId", required = true)
  public Integer getPlayableClassId() {
    return playableClassId;
  }

  public void setPlayableClassId(Integer playableClassId) {
    this.playableClassId = playableClassId;
  }

  public PlayableSpecializationDTO localizedData(String localizedData) {
    this.localizedData = localizedData;
    return this;
  }

  /**
   * Get localizedData
   * @return localizedData
  */
  @NotNull 
  @Schema(name = "localizedData", required = true)
  public String getLocalizedData() {
    return localizedData;
  }

  public void setLocalizedData(String localizedData) {
    this.localizedData = localizedData;
  }

  public PlayableSpecializationDTO specializationRoleDTO(SpecializationRoleDTO specializationRoleDTO) {
    this.specializationRoleDTO = specializationRoleDTO;
    return this;
  }

  /**
   * Get specializationRoleDTO
   * @return specializationRoleDTO
  */
  @NotNull @Valid 
  @Schema(name = "specializationRoleDTO", required = true)
  public SpecializationRoleDTO getSpecializationRoleDTO() {
    return specializationRoleDTO;
  }

  public void setSpecializationRoleDTO(SpecializationRoleDTO specializationRoleDTO) {
    this.specializationRoleDTO = specializationRoleDTO;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayableSpecializationDTO playableSpecializationDTO = (PlayableSpecializationDTO) o;
    return Objects.equals(this.id, playableSpecializationDTO.id) &&
        Objects.equals(this.mediaURL, playableSpecializationDTO.mediaURL) &&
        Objects.equals(this.playableClassId, playableSpecializationDTO.playableClassId) &&
        Objects.equals(this.localizedData, playableSpecializationDTO.localizedData) &&
        Objects.equals(this.specializationRoleDTO, playableSpecializationDTO.specializationRoleDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaURL, playableClassId, localizedData, specializationRoleDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableSpecializationDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaURL: ").append(toIndentedString(mediaURL)).append("\n");
    sb.append("    playableClassId: ").append(toIndentedString(playableClassId)).append("\n");
    sb.append("    localizedData: ").append(toIndentedString(localizedData)).append("\n");
    sb.append("    specializationRoleDTO: ").append(toIndentedString(specializationRoleDTO)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

