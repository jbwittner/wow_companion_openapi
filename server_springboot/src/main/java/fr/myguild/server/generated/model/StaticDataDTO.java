package fr.myguild.server.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fr.myguild.server.generated.model.CovenantDTO;
import fr.myguild.server.generated.model.FactionDTO;
import fr.myguild.server.generated.model.PlayableClassDTO;
import fr.myguild.server.generated.model.PlayableRaceDTO;
import fr.myguild.server.generated.model.PlayableSpecializationDTO;
import fr.myguild.server.generated.model.RealmDTO;
import fr.myguild.server.generated.model.SpecializationRoleDTO;
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
 * StaticDataDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class StaticDataDTO   {

  @JsonProperty("covenantDTOs")
  @Valid
  private List<CovenantDTO> covenantDTOs = new ArrayList<>();

  @JsonProperty("playableRaceDTOs")
  @Valid
  private List<PlayableRaceDTO> playableRaceDTOs = new ArrayList<>();

  @JsonProperty("factionDTOs")
  @Valid
  private List<FactionDTO> factionDTOs = new ArrayList<>();

  @JsonProperty("playableClassDTOs")
  @Valid
  private List<PlayableClassDTO> playableClassDTOs = new ArrayList<>();

  @JsonProperty("playableSpecializationDTOs")
  @Valid
  private List<PlayableSpecializationDTO> playableSpecializationDTOs = new ArrayList<>();

  @JsonProperty("specializationRoleDTOs")
  @Valid
  private List<SpecializationRoleDTO> specializationRoleDTOs = new ArrayList<>();

  @JsonProperty("realmDTOs")
  @Valid
  private List<RealmDTO> realmDTOs = new ArrayList<>();

  public StaticDataDTO covenantDTOs(List<CovenantDTO> covenantDTOs) {
    this.covenantDTOs = covenantDTOs;
    return this;
  }

  public StaticDataDTO addCovenantDTOsItem(CovenantDTO covenantDTOsItem) {
    this.covenantDTOs.add(covenantDTOsItem);
    return this;
  }

  /**
   * Get covenantDTOs
   * @return covenantDTOs
  */
  @NotNull @Valid 
  @Schema(name = "covenantDTOs", required = true)
  public List<CovenantDTO> getCovenantDTOs() {
    return covenantDTOs;
  }

  public void setCovenantDTOs(List<CovenantDTO> covenantDTOs) {
    this.covenantDTOs = covenantDTOs;
  }

  public StaticDataDTO playableRaceDTOs(List<PlayableRaceDTO> playableRaceDTOs) {
    this.playableRaceDTOs = playableRaceDTOs;
    return this;
  }

  public StaticDataDTO addPlayableRaceDTOsItem(PlayableRaceDTO playableRaceDTOsItem) {
    this.playableRaceDTOs.add(playableRaceDTOsItem);
    return this;
  }

  /**
   * Get playableRaceDTOs
   * @return playableRaceDTOs
  */
  @NotNull @Valid 
  @Schema(name = "playableRaceDTOs", required = true)
  public List<PlayableRaceDTO> getPlayableRaceDTOs() {
    return playableRaceDTOs;
  }

  public void setPlayableRaceDTOs(List<PlayableRaceDTO> playableRaceDTOs) {
    this.playableRaceDTOs = playableRaceDTOs;
  }

  public StaticDataDTO factionDTOs(List<FactionDTO> factionDTOs) {
    this.factionDTOs = factionDTOs;
    return this;
  }

  public StaticDataDTO addFactionDTOsItem(FactionDTO factionDTOsItem) {
    this.factionDTOs.add(factionDTOsItem);
    return this;
  }

  /**
   * Get factionDTOs
   * @return factionDTOs
  */
  @NotNull @Valid 
  @Schema(name = "factionDTOs", required = true)
  public List<FactionDTO> getFactionDTOs() {
    return factionDTOs;
  }

  public void setFactionDTOs(List<FactionDTO> factionDTOs) {
    this.factionDTOs = factionDTOs;
  }

  public StaticDataDTO playableClassDTOs(List<PlayableClassDTO> playableClassDTOs) {
    this.playableClassDTOs = playableClassDTOs;
    return this;
  }

  public StaticDataDTO addPlayableClassDTOsItem(PlayableClassDTO playableClassDTOsItem) {
    this.playableClassDTOs.add(playableClassDTOsItem);
    return this;
  }

  /**
   * Get playableClassDTOs
   * @return playableClassDTOs
  */
  @NotNull @Valid 
  @Schema(name = "playableClassDTOs", required = true)
  public List<PlayableClassDTO> getPlayableClassDTOs() {
    return playableClassDTOs;
  }

  public void setPlayableClassDTOs(List<PlayableClassDTO> playableClassDTOs) {
    this.playableClassDTOs = playableClassDTOs;
  }

  public StaticDataDTO playableSpecializationDTOs(List<PlayableSpecializationDTO> playableSpecializationDTOs) {
    this.playableSpecializationDTOs = playableSpecializationDTOs;
    return this;
  }

  public StaticDataDTO addPlayableSpecializationDTOsItem(PlayableSpecializationDTO playableSpecializationDTOsItem) {
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

  public StaticDataDTO specializationRoleDTOs(List<SpecializationRoleDTO> specializationRoleDTOs) {
    this.specializationRoleDTOs = specializationRoleDTOs;
    return this;
  }

  public StaticDataDTO addSpecializationRoleDTOsItem(SpecializationRoleDTO specializationRoleDTOsItem) {
    this.specializationRoleDTOs.add(specializationRoleDTOsItem);
    return this;
  }

  /**
   * Get specializationRoleDTOs
   * @return specializationRoleDTOs
  */
  @NotNull @Valid 
  @Schema(name = "specializationRoleDTOs", required = true)
  public List<SpecializationRoleDTO> getSpecializationRoleDTOs() {
    return specializationRoleDTOs;
  }

  public void setSpecializationRoleDTOs(List<SpecializationRoleDTO> specializationRoleDTOs) {
    this.specializationRoleDTOs = specializationRoleDTOs;
  }

  public StaticDataDTO realmDTOs(List<RealmDTO> realmDTOs) {
    this.realmDTOs = realmDTOs;
    return this;
  }

  public StaticDataDTO addRealmDTOsItem(RealmDTO realmDTOsItem) {
    this.realmDTOs.add(realmDTOsItem);
    return this;
  }

  /**
   * Get realmDTOs
   * @return realmDTOs
  */
  @NotNull @Valid 
  @Schema(name = "realmDTOs", required = true)
  public List<RealmDTO> getRealmDTOs() {
    return realmDTOs;
  }

  public void setRealmDTOs(List<RealmDTO> realmDTOs) {
    this.realmDTOs = realmDTOs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticDataDTO staticDataDTO = (StaticDataDTO) o;
    return Objects.equals(this.covenantDTOs, staticDataDTO.covenantDTOs) &&
        Objects.equals(this.playableRaceDTOs, staticDataDTO.playableRaceDTOs) &&
        Objects.equals(this.factionDTOs, staticDataDTO.factionDTOs) &&
        Objects.equals(this.playableClassDTOs, staticDataDTO.playableClassDTOs) &&
        Objects.equals(this.playableSpecializationDTOs, staticDataDTO.playableSpecializationDTOs) &&
        Objects.equals(this.specializationRoleDTOs, staticDataDTO.specializationRoleDTOs) &&
        Objects.equals(this.realmDTOs, staticDataDTO.realmDTOs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(covenantDTOs, playableRaceDTOs, factionDTOs, playableClassDTOs, playableSpecializationDTOs, specializationRoleDTOs, realmDTOs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticDataDTO {\n");
    sb.append("    covenantDTOs: ").append(toIndentedString(covenantDTOs)).append("\n");
    sb.append("    playableRaceDTOs: ").append(toIndentedString(playableRaceDTOs)).append("\n");
    sb.append("    factionDTOs: ").append(toIndentedString(factionDTOs)).append("\n");
    sb.append("    playableClassDTOs: ").append(toIndentedString(playableClassDTOs)).append("\n");
    sb.append("    playableSpecializationDTOs: ").append(toIndentedString(playableSpecializationDTOs)).append("\n");
    sb.append("    specializationRoleDTOs: ").append(toIndentedString(specializationRoleDTOs)).append("\n");
    sb.append("    realmDTOs: ").append(toIndentedString(realmDTOs)).append("\n");
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

