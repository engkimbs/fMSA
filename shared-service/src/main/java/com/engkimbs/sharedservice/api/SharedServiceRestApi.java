package com.engkimbs.sharedservice.api;

import com.engkimbs.sharedservice.api.dto.AreaMstRequest;
import com.engkimbs.sharedservice.config.SharedServiceMapper;
import com.engkimbs.sharedservice.domain.entity.AreaMst;
import com.engkimbs.sharedservice.service.command.SharedCommandService;
import com.engkimbs.sharedservice.service.query.SharedQueryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Tag(name = "shared-service-rest-api", description = "Common API Service for RMS shared process standard information")
@RestController
@Slf4j
public class SharedServiceRestApi {

    SharedQueryService sharedQueryService;

    SharedCommandService sharedCommandService;

    public SharedServiceRestApi(SharedQueryService sharedQueryService,
                                SharedCommandService sharedCommandService) {
        this.sharedQueryService = sharedQueryService;
        this.sharedCommandService = sharedCommandService;
    }

    @Operation(summary = "Get Area Master Data", description = "API for Area Master Data for process")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "successful operation",
                    content = @Content(schema = @Schema(implementation = AreaMst.class))),
            @ApiResponse(
                    responseCode = "400",
                    description = "bad request operation",
                    content = @Content(schema = @Schema(implementation = AreaMst.class)))
    })
    @GetMapping("/shared/{id}")
    public AreaMst getAreaMst(
            @Parameter(description = "Area Master ID")
            @PathVariable Long id) {
        return sharedQueryService.getAreaMstById(id);
    }

    @PostMapping("/shared/save")
    public AreaMst saveAreaMst(@RequestBody AreaMstRequest areaMstRequest) {
        return sharedCommandService.saveAreaMst(SharedServiceMapper.INSTANCE.toAreaMst(areaMstRequest));
    }

    @PutMapping("/shared/update")
    public AreaMst updateAreaMst(@RequestBody AreaMstRequest areaMstRequest) {
        return sharedCommandService.updateAreaMst(SharedServiceMapper.INSTANCE.toAreaMst(areaMstRequest));
    }

    @DeleteMapping("/shared/{id}")
    public void deleteAreaMst(@PathVariable Long id) {
        sharedCommandService.deleteAreaMstById(id);
    }
}
