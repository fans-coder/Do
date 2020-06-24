package bean.e04.toolbean;
import java.util.ArrayList;
import bean.e04.valuebean.GoodsSingle;
public class ShopCar {
    private ArrayList<GoodsSingle> buylist=new ArrayList<GoodsSingle>();

    public ArrayList<GoodsSingle> getBuylist() {
        return buylist;
    }
    public void addItems(bean.e04.valuebean.GoodsSingle single){
        if(single!=null){
            if(buylist.size()==0){
                bean.e04.valuebean.GoodsSingle ans=new bean.e04.valuebean.GoodsSingle();
                ans.setName(single.getName());
                ans.setPrice(single.getPrice());
                ans.setNum(single.getNum());
                buylist.add(ans);
            }else {
                int i=0;
                for(;i<buylist.size();i++){
                    bean.e04.valuebean.GoodsSingle ans=(GoodsSingle)buylist.get(i);
                    if(ans.getName().equals(single.getName())){
                        ans.setNum(ans.getNum()+1);
                        break;
                    }
                }
                if(i>=buylist.size()){
                    bean.e04.valuebean.GoodsSingle ans=new GoodsSingle();
                    ans.setNum(single.getNum());
                    ans.setName(single.getName());
                    ans.setPrice(single.getPrice());
                    buylist.add(ans);
                }
            }
        }
    }
public void removeItems(String name){
        for(int i=0;i<buylist.size();i++){
            bean.e04.valuebean.GoodsSingle ans=(GoodsSingle)buylist.get(i);
            if(ans.getName().equals(Mytools.toChinese(name))){
                if(ans.getNum()>1){
                    ans.setNum(ans.getNum()-1);
                    break;
                }else if(ans.getNum()==1){
                    buylist.remove(i);
                }
            }
        }
}
public void clearCar(){buylist.clear();}
}
