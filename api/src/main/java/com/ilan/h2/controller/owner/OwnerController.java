package com.ilan.h2.controller.owner;

import com.ilan.h2.entity.Owner;
import com.ilan.h2.service.OwnerRepositoryService;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerRepositoryService ownerRepository;

    @GetMapping(value = "/findOwnerByName/{name}")
    public List<Owner> findOwnerByName(@Parameter(description = "Name", required = true, example = "Ilankumaran") @PathVariable("name") String name) {
        return ownerRepository.findOwnerByName(name);
    }

    @GetMapping(value = "/findOwnerByNameAndTitle/{name}/{title}")
    public List<Owner> findOwnerByNameAndTitle(@Parameter(description = "Name", required = true, example = "Ilankumaran") @PathVariable("name") String name, @Parameter(description = "titleName", required = true, example = "Snow") @PathVariable(value = "title") String title) {
        return ownerRepository.findOwnerByNameAndTitle(name, title);
    }
}
