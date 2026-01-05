package com.lucadani.infinityengine;

import org.springframework.boot.SpringApplication;

public class TestInfinityengineApplication {

	public static void main(String[] args) {
		SpringApplication.from(InfinityengineApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
