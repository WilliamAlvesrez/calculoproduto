package iftm.edu.br.calculoproduto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import iftm.edu.br.calculoproduto.Entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByVendidoComDescontoFalse();

    List<Item> findByVendidoComDescontoTrue();

    List<Item> findAllByOrderByValorUnitDesc();

    Item findTopByOrderByQuantidadeDesc();

    @Query("SELECT nf FROM Item nf WHERE nf.quantidade > 10")
    List<Item> findNfWithMoreThanTenUnitsSold();

    @Query("SELECT nf FROM Item nf WHERE nf.valorUnit > 500 ORDER BY nf.valorUnit DESC")
    List<Item> findNfWithTotalValueGreaterThan500();
}