package marcos.moreira.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import marcos.moreira.spring.mvc.models.Livro;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LivroController {
    
    @GetMapping("/livros")
    public String listarLivros(Model model) {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Dom Quixote", "Miguel de Cervantes", 1605));
        livros.add(new Livro("Cem Anos de Solidão", "Gabriel Garcia Márquez", 1967));

        model.addAttribute("livros", livros);

        return "livros";
    }
}
