/**
 * @Created-by: Stas Orehov
 * @Date: 14/03/2023 6:15
 * @Project-Name: SpringProject
 */
package com.stas.server.data;

import com.stas.server.enums.Type;

public class SuccessfulLoginData {

    private long id;
    private Type type;

    public SuccessfulLoginData(long id,  Type type) {
        this.id = id;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
