package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ToolDescriptor;



/**
 * A tool version describes a particular iteration of a tool as described by a reference to a specific image and dockerfile.
 **/

@ApiModel(description = "A tool version describes a particular iteration of a tool as described by a reference to a specific image and dockerfile.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-26T18:50:10.120Z")
public class ToolVersion   {
  
  private String name = null;
  private String globalId = null;
  private String registryId = null;
  private ToolDescriptor descriptor = null;
  private String image = null;
  private String dockerfile = null;

  
  /**
   * The name of the version.
   **/
  
  @ApiModelProperty(value = "The name of the version.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The unique identifier for this version of a tool. (Proposed - This id should be globally unique across systems and should also identify the system that it comes from for example This id should be globally unique across systems, should also identify the system that it comes from, and be a URL that resolves for example `http://agora.broadinstitute.org/tools/123456/v1` This can be the same as the registry-id depending on the structure of your registry)
   **/
  
  @ApiModelProperty(required = true, value = "The unique identifier for this version of a tool. (Proposed - This id should be globally unique across systems and should also identify the system that it comes from for example This id should be globally unique across systems, should also identify the system that it comes from, and be a URL that resolves for example `http://agora.broadinstitute.org/tools/123456/v1` This can be the same as the registry-id depending on the structure of your registry)")
  @JsonProperty("global-id")
  public String getGlobalId() {
    return globalId;
  }
  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  
  /**
   * A unique identifier of the tool for this particular tool registry, for example `123456` or `123456_v1`
   **/
  
  @ApiModelProperty(value = "A unique identifier of the tool for this particular tool registry, for example `123456` or `123456_v1`")
  @JsonProperty("registry-id")
  public String getRegistryId() {
    return registryId;
  }
  public void setRegistryId(String registryId) {
    this.registryId = registryId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("descriptor")
  public ToolDescriptor getDescriptor() {
    return descriptor;
  }
  public void setDescriptor(ToolDescriptor descriptor) {
    this.descriptor = descriptor;
  }

  
  /**
   * The docker path to the image (and version) for this tool. (e.g. quay.io/seqware/seqware_full/1.1)
   **/
  
  @ApiModelProperty(required = true, value = "The docker path to the image (and version) for this tool. (e.g. quay.io/seqware/seqware_full/1.1)")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * The url to the dockerfile used to build this image, should include version information (e.g. https://github.com/ICGC-TCGA-PanCancer/pcawg_delly_workflow/blob/master/delly_docker/Dockerfile )
   **/
  
  @ApiModelProperty(value = "The url to the dockerfile used to build this image, should include version information (e.g. https://github.com/ICGC-TCGA-PanCancer/pcawg_delly_workflow/blob/master/delly_docker/Dockerfile )")
  @JsonProperty("dockerfile")
  public String getDockerfile() {
    return dockerfile;
  }
  public void setDockerfile(String dockerfile) {
    this.dockerfile = dockerfile;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolVersion toolVersion = (ToolVersion) o;
    return Objects.equals(name, toolVersion.name) &&
        Objects.equals(globalId, toolVersion.globalId) &&
        Objects.equals(registryId, toolVersion.registryId) &&
        Objects.equals(descriptor, toolVersion.descriptor) &&
        Objects.equals(image, toolVersion.image) &&
        Objects.equals(dockerfile, toolVersion.dockerfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, globalId, registryId, descriptor, image, dockerfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolVersion {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    dockerfile: ").append(toIndentedString(dockerfile)).append("\n");
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
