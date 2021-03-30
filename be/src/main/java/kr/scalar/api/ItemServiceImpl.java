package kr.scalar.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemDao;
    @Override
    public String save(Item item) {
        System.out.println("=== 2 ==== :"+item.toString());
        Item itm = itemDao.save(item);
        return (itm != null) ? "SUCCESS": "FAILURE";
    }

    @Override
    public List<Item> all() {
        return itemDao.findAll();
    }

    @Override
    public Optional<Item> one(long id) {
        return itemDao.findById(id);
    }

    @Override
    public String edit(Item item) {
        Item itm = itemDao.save(item);
        return (itm != null) ? "SUCCESS": "FAILURE";
    }

    @Override
    public String delete(long id) {
        itemDao.deleteById(id);
        return "SUCCESS";
    }
}
