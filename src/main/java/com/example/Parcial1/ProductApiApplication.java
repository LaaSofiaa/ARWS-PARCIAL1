package com.example.Parcial1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class ProductApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductApiApplication.class, args);
	}
}