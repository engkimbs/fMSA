package com.engkimbs.sharedservice.service.command;

import com.engkimbs.sharedservice.domain.entity.AreaMst;
import com.engkimbs.sharedservice.infra.db.SharedServiceRDBRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class SharedCommandService {

    SharedServiceRDBRepository sharedServiceRDBRepository;

    public SharedCommandService(SharedServiceRDBRepository sharedServiceRDBRepository) {
        this.sharedServiceRDBRepository = sharedServiceRDBRepository;
    }

    public AreaMst saveAreaMst(final AreaMst areaMst) {
        return sharedServiceRDBRepository.save(areaMst);
    }

    public AreaMst updateAreaMst(final AreaMst areaMst) {
        Optional<AreaMst> fetchedAreaMst = sharedServiceRDBRepository.findById(areaMst.getId());
        fetchedAreaMst.ifPresent(fetched -> fetched.updateAreaMst(areaMst));
        return areaMst;
    }

    public void deleteAreaMstById(Long id) {
        sharedServiceRDBRepository.deleteById(id);
    }
}