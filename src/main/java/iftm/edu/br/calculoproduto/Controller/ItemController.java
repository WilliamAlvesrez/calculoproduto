package iftm.edu.br.calculoproduto.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import iftm.edu.br.calculoproduto.Entity.Item;
import iftm.edu.br.calculoproduto.Service.ItemService;


@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/no-discount")
    public List<Item> getAllItemsWithoutDiscount() {
        return itemService.getAllItemsWithoutDiscount();
    }

    @GetMapping("/with-discount")
    public List<Item> getAllItemsWithDiscount() {
        return itemService.getAllItemsWithDiscount();
    }

    @GetMapping("/ordered-by-value")
    public List<Item> getAllItemsOrderedByValue() {
        return itemService.getAllItemsOrderedByValue();
    }

    @GetMapping("/top-sold")
    public Item getTopSoldItem() {
        return itemService.getTopSoldItem();
    }

    @GetMapping("/nf-more-than-ten")
    public List<Item> getNfWithMoreThanTenUnitsSold() {
        return itemService.getNfWithMoreThanTenUnitsSold();
    }

    @GetMapping("/nf-total-greater-500")
    public List<Item> getNfWithTotalValueGreaterThan500() {
        return itemService.getNfWithTotalValueGreaterThan500();
    }
}
