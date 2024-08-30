package iftm.edu.br.calculoproduto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import iftm.edu.br.calculoproduto.Entity.Item;
import iftm.edu.br.calculoproduto.Repository.ItemRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItemsWithoutDiscount() {
        return itemRepository.findByVendidoComDescontoFalse();
    }

    public List<Item> getAllItemsWithDiscount() {
        return itemRepository.findByVendidoComDescontoTrue();
    }

    public List<Item> getAllItemsOrderedByValue() {
        return itemRepository.findAllByOrderByValorUnitDesc();
    }

    public Item getTopSoldItem() {
        return itemRepository.findTopByOrderByQuantidadeDesc();
    }

    public List<Item> getNfWithMoreThanTenUnitsSold() {
        return itemRepository.findNfWithMoreThanTenUnitsSold();
    }

    public List<Item> getNfWithTotalValueGreaterThan500() {
        return itemRepository.findNfWithTotalValueGreaterThan500();
    }
}