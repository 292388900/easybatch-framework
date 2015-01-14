/*
 * The MIT License
 *
 *  Copyright (c) 2015, Mahmoud Ben Hassine (mahmoud@benhassine.fr)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package org.easybatch.core.api.event.record;

import org.easybatch.core.api.Record;

/**
 * Event interface collection for RecordMapper events.
 * <p>
 * You should implement this interface in your mapper to
 * declare the ability to receive events from the batch process.
 *
 * @author Mario Mueller (mario@xenji.com)
 */
public interface RecordMapperEventListener {

    /**
     * Called before the mapper call.
     *
     * @param record The record that will be passed to the record call.
     */
    public void beforeMapRecord(Record record);

    /**
     * Called directly after the mapper call.
     *
     * @param record The incoming record.
     * @param typedRecord The mapping result.
     */
    public void afterMapRecord(Record record, Object typedRecord);

    /**
     * When the mapper throws an exception, this method will get the exception.
     * In addition you will receive the incoming record for further inspection.
     *
     * @param t The exception thrown.
     * @param record The record that was processed while the exception was thrown.
     */
    public void onMapperException(Throwable t, Record record);
}
