/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeb
 */
public class ArchiveItem {
    private String name;
    private String id;

    public ArchiveItem(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (!(o instanceof ArchiveItem)) {
            return false;
        }
        
        return id.equals(((ArchiveItem)o).id);
    }
    
    @Override
    public String toString() {
        return id + ": " + name;
    }
    
}
