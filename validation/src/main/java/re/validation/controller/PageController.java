package re.validation.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import re.validation.model.dto.AddressDto;

@Controller
public class PageController {

    @ModelAttribute("addressDto")
    public AddressDto addressDto() {
        return new AddressDto();
    }

    @GetMapping("/")
    public String home() {
        return "productList";
    }

    @GetMapping("/form-add")
    public String formAdd() {
        return "form-add";
    }

    @PostMapping("/form-add")
    public String submitAddress(
            @Valid @ModelAttribute("addressDto") AddressDto addressDto,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "form-add";
        }

        redirectAttributes.addFlashAttribute("message", "Cập nhật địa chỉ thành công!");
        return "redirect:/form-add";
    }
}
