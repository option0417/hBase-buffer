package tw.com.wd.hbase.util.hbasebuffer;

import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Row;
import tw.com.wd.hbase.util.hbasebuffer.exception.HBufferException;

public interface IHBaseBuffer extends IShutdownable {
    /**
     * Put Row operation (ex. Put, Get, Append, Increment, etc.) to HBaseBuffer
     * @param hbaseOP Row
     * @param tblName TableName
     * @return true if succeeded or false if cant put
     * @throws HBufferException
     */
    public boolean put(Row hbaseOP, TableName tblName) throws HBufferException;

    /**
     * Flush Rows in buffer to HBase
     * @throws HBufferException
     */
    public void flush() throws HBufferException;

    /**
     * Get size of buffer
     * @throws HBufferException
     */
    public int size();
}
