package commonline.query.sql;

import flapjack.layout.FieldDefinition;

/**
 * Created by IntelliJ IDEA.
 * User: dan
 * Date: Feb 2, 2009
 * Time: 12:58:29 PM
 * To change this template use File | Settings | File Templates.
 */
public interface SqlTypeResolver {
    SqlType resolve(FieldDefinition fieldDef);
}
