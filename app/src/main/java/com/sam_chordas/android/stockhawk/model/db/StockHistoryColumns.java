package com.sam_chordas.android.stockhawk.model.db;

import net.simonvt.schematic.annotation.AutoIncrement;
import net.simonvt.schematic.annotation.DataType;
import net.simonvt.schematic.annotation.NotNull;
import net.simonvt.schematic.annotation.PrimaryKey;

/**
 * Created by m_alrajab on 8/21/16.
 * Stock history table
 *
 * required an update from the main table
 * ToDo: from the stockfragment  to be insert the new entry if market is open
 *
 */
public class StockHistoryColumns {
    @DataType(DataType.Type.INTEGER) @PrimaryKey
    @AutoIncrement
    public static final String _ID = "_id";
    @DataType(DataType.Type.TEXT) @NotNull
    public static final String SYMBOL = "symbol";
    @DataType(DataType.Type.REAL) @NotNull
    public static final String CLOSEPRICE = "close_price";
    @DataType(DataType.Type.REAL) @NotNull
    public static final String TIMESTAMP = "Timestamp";
}