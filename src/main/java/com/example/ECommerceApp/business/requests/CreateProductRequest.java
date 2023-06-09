package com.example.ECommerceApp.business.requests;
import com.example.ECommerceApp.enums.ProductMaterial;
import com.example.ECommerceApp.enums.RingSize;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class CreateProductRequest {

    private String productName;

    @NotNull
    private Double productPrice;

    @NotNull
    private String productImageUrl;

    @NotNull
    private String productDetails;

    @Enumerated(EnumType.STRING)
    @NotNull
    private ProductMaterial productMaterial;

    @NotNull
    private Map<RingSize, Integer> sizeStockMap;
    public CreateProductRequest() {
        this.sizeStockMap = new HashMap<>();
    }

}
