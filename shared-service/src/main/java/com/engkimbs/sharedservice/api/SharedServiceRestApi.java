package com.engkimbs.sharedservice.api;

import com.engkimbs.sharedservice.api.dto.AreaMstRequest;
import com.engkimbs.sharedservice.config.SharedServiceMapper;
import com.engkimbs.sharedservice.domain.entity.AreaMst;
import com.engkimbs.sharedservice.service.command.SharedCommandService;
import com.engkimbs.sharedservice.service.query.SharedQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/shared/{id}")
    public AreaMst getAreaMst(@PathVariable Long id) {
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
