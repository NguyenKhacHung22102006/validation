package re.validation.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import re.validation.model.dto.AddressDto;

@RestController
@RequestMapping("/api/address")
public class UserController {

    @PostMapping("/update")
    public ResponseEntity<String> updateAddress(@Valid @RequestBody AddressDto addressDto) {

        return ResponseEntity.ok("Cập nhật địa chỉ thành công!");
    }
}
