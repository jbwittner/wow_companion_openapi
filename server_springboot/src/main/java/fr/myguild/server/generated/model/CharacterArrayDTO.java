package fr.myguild.server.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.myguild.server.generated.model.CharacterDTO;
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
 * CharacterArrayDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CharacterArrayDTO   {

  @JsonProperty("characterDTOs")
  @Valid
  private List<CharacterDTO> characterDTOs = null;

  public CharacterArrayDTO characterDTOs(List<CharacterDTO> characterDTOs) {
    this.characterDTOs = characterDTOs;
    return this;
  }

  public CharacterArrayDTO addCharacterDTOsItem(CharacterDTO characterDTOsItem) {
    if (this.characterDTOs == null) {
      this.characterDTOs = new ArrayList<>();
    }
    this.characterDTOs.add(characterDTOsItem);
    return this;
  }

  /**
   * Get characterDTOs
   * @return characterDTOs
  */
  @Valid 
  @Schema(name = "characterDTOs", required = false)
  public List<CharacterDTO> getCharacterDTOs() {
    return characterDTOs;
  }

  public void setCharacterDTOs(List<CharacterDTO> characterDTOs) {
    this.characterDTOs = characterDTOs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterArrayDTO characterArrayDTO = (CharacterArrayDTO) o;
    return Objects.equals(this.characterDTOs, characterArrayDTO.characterDTOs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterDTOs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterArrayDTO {\n");
    sb.append("    characterDTOs: ").append(toIndentedString(characterDTOs)).append("\n");
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

