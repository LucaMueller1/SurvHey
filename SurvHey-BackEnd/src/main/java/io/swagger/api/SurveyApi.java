/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-01T12:29:37.288Z[GMT]")
public interface SurveyApi {

    @Operation(summary = "Create new survey", description = "Creates a new survey for the logged-in user", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={ "survey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Survey.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ApiError.class))) })
    @RequestMapping(value = "/survey",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Survey> createSurvey(@Parameter(in = ParameterIn.DEFAULT, description = "Created survey object", schema=@Schema()) @Valid @RequestBody SurveyPrepare body);


    @Operation(summary = "Creates a new submission for the given survey", description = "Endpoint is used by the end-user to create a new submission", tags={ "submission" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Submission.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ApiError.class))) })
    @RequestMapping(value = "/survey/{id}/submission",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Submission> createSurveySubmission(@Parameter(in = ParameterIn.PATH, description = "ID of survey to create a new submission for", required=true, schema=@Schema()) @PathVariable("id") Long id, @Parameter(in = ParameterIn.DEFAULT, description = "Created submission object for survey", schema=@Schema()) @Valid @RequestBody SubmissionPrepare body);


    @Operation(summary = "Delete survey by id", description = "Deletes the corresponding survey", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={ "survey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation"),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ApiError.class))) })
    @RequestMapping(value = "/survey/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSurveyById(@Parameter(in = ParameterIn.PATH, description = "ID of survey to update", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Returns an analysis for the given survey", description = "Returns an analysis object that contains data about the survey participants", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={ "survey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Analysis.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ApiError.class))) })
    @RequestMapping(value = "/survey/{id}/analysis",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Analysis> getSurveyAnalysisById(@Parameter(in = ParameterIn.PATH, description = "ID of survey to return an analysis for", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Get survey by id", description = "Returns survey by id without need for authentication. This endpoint returns the survey for end-users", tags={ "survey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Survey.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ApiError.class))) })
    @RequestMapping(value = "/survey/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Survey> getSurveyById(@Parameter(in = ParameterIn.PATH, description = "ID of survey to return", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Returns results of the given survey", description = "Returns a more simple representation of survey results for the end-user to view", tags={ "submission" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = SurveyResult.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ApiError.class))) })
    @RequestMapping(value = "/survey/{id}/results",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SurveyResult> getSurveyResultsById(@Parameter(in = ParameterIn.PATH, description = "ID of survey to return results for", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Returns all submissions for the given survey", description = "Returns a list of all submissions for the given survey", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={ "submission" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Submission.class)))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ApiError.class))) })
    @RequestMapping(value = "/survey/{id}/submissions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Submission>> getSurveySubmissionsById(@Parameter(in = ParameterIn.PATH, description = "ID of survey to return all submissions for", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Update survey by id", description = "Updates the corresponding survey", security = {
        @SecurityRequirement(name = "ApiKeyAuth")    }, tags={ "survey" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Survey.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ApiError.class))) })
    @RequestMapping(value = "/survey/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Survey> updateSurveyById(@Parameter(in = ParameterIn.PATH, description = "ID of survey to update", required=true, schema=@Schema()) @PathVariable("id") Long id, @Parameter(in = ParameterIn.DEFAULT, description = "Created survey object", schema=@Schema()) @Valid @RequestBody SurveyPrepare body);


    @Operation(summary = "Get fingerprints by cookieID", description = "Returns fingerprints for given cookieID", security = {
            @SecurityRequirement(name = "ApiKeyAuth")    }, tags={ "survey" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Fingerprint.class))),

            @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(schema = @Schema(implementation = ApiError.class))) })
    @RequestMapping(value = "/fingerprints/{cookie}",
            produces = { "application/json" },

            method = RequestMethod.GET)
    ResponseEntity<List<Fingerprint>> getParticipationsOfParticipant(@Parameter(in = ParameterIn.PATH, description = "CookieID needed", required=true, schema=@Schema()) @PathVariable("cookie") String cookie);

}

