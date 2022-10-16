package com.example.demo.controller;

import com.example.demo.request.mathRequest;
import com.example.demo.response.generalResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("new")
public class newController {
    @PostMapping("addition")
    public ResponseEntity<?> addition(@RequestBody mathRequest mathRequest) {
        generalResponse gr = new generalResponse();
        int num1 = mathRequest.getNum1();
        int num2 = mathRequest.getNum2();
        int sum = num1 + num2;
        gr.setSum(sum);
        gr.setMessage("this is a sum");
        return ResponseEntity.ok(gr);


    }

    @PostMapping("subtraction")
    public ResponseEntity<?> subtraction(@RequestBody mathRequest mathRequest) {
        generalResponse gr = new generalResponse();
        int num1 = mathRequest.getNum1();
        int num2 = mathRequest.getNum2();
        int sum = num1 - num2;
        gr.setSubtraction(sum);
        gr.setMessage("this is a subtraction");
        return ResponseEntity.ok(gr);
    }

    @PostMapping("divide")
    public ResponseEntity<?> divide(@RequestBody mathRequest mathRequest) {
        generalResponse gr = new generalResponse();
        int num1 = mathRequest.getNum1();
        int num2 = mathRequest.getNum2();
        int sum = num1 / num2;
        gr.setSubtraction(sum);
        gr.setMessage("this is a division");
        return ResponseEntity.ok(gr);
    }

    @PostMapping("multiply")
    public ResponseEntity<?> multiply(@RequestBody mathRequest mathRequest) {
        generalResponse gr = new generalResponse();
        int num1 = mathRequest.getNum1();
        int num2 = mathRequest.getNum2();
        int sum = num1 * num2;
        gr.setSubtraction(sum);
        gr.setMessage("this is a multiply");
        return ResponseEntity.ok(gr);
    }
}
