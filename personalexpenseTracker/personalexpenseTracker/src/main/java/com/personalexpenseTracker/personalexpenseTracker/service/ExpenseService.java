package com.example.personalexpenseTracker.service;

import com.example.personalexpenseTracker.entity.Expense;
import com.example.personalexpenseTracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense addExpense(Expense expense) {
        return repository.save(expense);
    }

    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }

    public List<Expense> getExpensesByCategory(String category) {
        return repository.findByCategory(category);
    }
}
