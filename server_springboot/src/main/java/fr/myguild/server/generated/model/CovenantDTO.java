package fr.myguild.server.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.myguild.server.generated.model.LocalizedDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CovenantDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CovenantDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("mediaURL")
  private String mediaURL;

  @JsonProperty("localizedDTO")
  private LocalizedDTO localizedDTO;

  public CovenantDTO id(Integer id) {
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

  public CovenantDTO mediaURL(String mediaURL) {
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

  public CovenantDTO localizedDTO(LocalizedDTO localizedDTO) {
    this.localizedDTO = localizedDTO;
    return this;
  }

  /**
   * Get localizedDTO
   * @return localizedDTO
  */
  @NotNull @Valid 
  @Schema(name = "localizedDTO", required = true)
  public LocalizedDTO getLocalizedDTO() {
    return localizedDTO;
  }

  public void setLocalizedDTO(LocalizedDTO localizedDTO) {
    this.localizedDTO = localizedDTO;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CovenantDTO covenantDTO = (CovenantDTO) o;
    return Objects.equals(this.id, covenantDTO.id) &&
        Objects.equals(this.mediaURL, covenantDTO.mediaURL) &&
        Objects.equals(this.localizedDTO, covenantDTO.localizedDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaURL, localizedDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovenantDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaURL: ").append(toIndentedString(mediaURL)).append("\n");
    sb.append("    localizedDTO: ").append(toIndentedString(localizedDTO)).append("\n");
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

