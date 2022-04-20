package fr.wowcompanion.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.wowcompanion.openapi.model.PlayableSpecializationDTO;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayableClassDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlayableClassDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("mediaURL")
  private String mediaURL;

  @JsonProperty("localizedData")
  private String localizedData;

  @JsonProperty("playableSpecializationDTOs")
  @Valid
  private List<PlayableSpecializationDTO> playableSpecializationDTOs = new ArrayList<>();

  public PlayableClassDTO id(Integer id) {
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

  public PlayableClassDTO mediaURL(String mediaURL) {
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

  public PlayableClassDTO localizedData(String localizedData) {
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

  public PlayableClassDTO playableSpecializationDTOs(List<PlayableSpecializationDTO> playableSpecializationDTOs) {
    this.playableSpecializationDTOs = playableSpecializationDTOs;
    return this;
  }

  public PlayableClassDTO addPlayableSpecializationDTOsItem(PlayableSpecializationDTO playableSpecializationDTOsItem) {
    this.playableSpecializationDTOs.add(playableSpecializationDTOsItem);
    return this;
  }

  /**
   * Get playableSpecializationDTOs
   * @return playableSpecializationDTOs
  */
  @NotNull @Valid 
  @Schema(name = "playableSpecializationDTOs", required = true)
  public List<PlayableSpecializationDTO> getPlayableSpecializationDTOs() {
    return playableSpecializationDTOs;
  }

  public void setPlayableSpecializationDTOs(List<PlayableSpecializationDTO> playableSpecializationDTOs) {
    this.playableSpecializationDTOs = playableSpecializationDTOs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayableClassDTO playableClassDTO = (PlayableClassDTO) o;
    return Objects.equals(this.id, playableClassDTO.id) &&
        Objects.equals(this.mediaURL, playableClassDTO.mediaURL) &&
        Objects.equals(this.localizedData, playableClassDTO.localizedData) &&
        Objects.equals(this.playableSpecializationDTOs, playableClassDTO.playableSpecializationDTOs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaURL, localizedData, playableSpecializationDTOs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableClassDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaURL: ").append(toIndentedString(mediaURL)).append("\n");
    sb.append("    localizedData: ").append(toIndentedString(localizedData)).append("\n");
    sb.append("    playableSpecializationDTOs: ").append(toIndentedString(playableSpecializationDTOs)).append("\n");
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

