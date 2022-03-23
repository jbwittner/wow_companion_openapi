package fr.myguild.server.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.myguild.server.generated.model.FactionDTO;
import fr.myguild.server.generated.model.LocalizedDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayableRaceDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PlayableRaceDTO   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("factionDTO")
  private FactionDTO factionDTO;

  @JsonProperty("localizedDTO")
  private LocalizedDTO localizedDTO;

  public PlayableRaceDTO id(Integer id) {
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

  public PlayableRaceDTO factionDTO(FactionDTO factionDTO) {
    this.factionDTO = factionDTO;
    return this;
  }

  /**
   * Get factionDTO
   * @return factionDTO
  */
  @NotNull @Valid 
  @Schema(name = "factionDTO", required = true)
  public FactionDTO getFactionDTO() {
    return factionDTO;
  }

  public void setFactionDTO(FactionDTO factionDTO) {
    this.factionDTO = factionDTO;
  }

  public PlayableRaceDTO localizedDTO(LocalizedDTO localizedDTO) {
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
    PlayableRaceDTO playableRaceDTO = (PlayableRaceDTO) o;
    return Objects.equals(this.id, playableRaceDTO.id) &&
        Objects.equals(this.factionDTO, playableRaceDTO.factionDTO) &&
        Objects.equals(this.localizedDTO, playableRaceDTO.localizedDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, factionDTO, localizedDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableRaceDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    factionDTO: ").append(toIndentedString(factionDTO)).append("\n");
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

