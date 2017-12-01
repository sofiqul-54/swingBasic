/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.urmi.dao;

import com.urmi.domain.ProductSummary;
import com.urmi.domain.User;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public interface ProductSummaryDao {

    void save(ProductSummary s);

    void update(ProductSummary s);

    void delete(int id);

    List<ProductSummary> getList();

    User getProductSummary(int id);

    public ProductSummary getProductSummaryByProductCode(String productCode);

    public ProductSummary getProductSummaryById(int id);
}
