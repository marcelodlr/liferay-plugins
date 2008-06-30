/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.sample.service.persistence;

/**
 * <a href="NotepadEntryPersistence.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public interface NotepadEntryPersistence {
	public com.liferay.sample.model.NotepadEntry create(long notepadEntryId);

	public com.liferay.sample.model.NotepadEntry remove(long notepadEntryId)
		throws com.liferay.portal.SystemException,
			com.liferay.sample.NoSuchNotepadEntryException;

	public com.liferay.sample.model.NotepadEntry remove(
		com.liferay.sample.model.NotepadEntry notepadEntry)
		throws com.liferay.portal.SystemException;

	public com.liferay.sample.model.NotepadEntry update(
		com.liferay.sample.model.NotepadEntry notepadEntry)
		throws com.liferay.portal.SystemException;

	public com.liferay.sample.model.NotepadEntry update(
		com.liferay.sample.model.NotepadEntry notepadEntry, boolean merge)
		throws com.liferay.portal.SystemException;

	public com.liferay.sample.model.NotepadEntry updateImpl(
		com.liferay.sample.model.NotepadEntry notepadEntry, boolean merge)
		throws com.liferay.portal.SystemException;

	public com.liferay.sample.model.NotepadEntry findByPrimaryKey(
		long notepadEntryId)
		throws com.liferay.portal.SystemException,
			com.liferay.sample.NoSuchNotepadEntryException;

	public com.liferay.sample.model.NotepadEntry fetchByPrimaryKey(
		long notepadEntryId) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.sample.model.NotepadEntry> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.sample.model.NotepadEntry> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer,
		int start, int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.sample.model.NotepadEntry> findAll()
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.sample.model.NotepadEntry> findAll(
		int start, int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.sample.model.NotepadEntry> findAll(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public void removeAll() throws com.liferay.portal.SystemException;

	public int countAll() throws com.liferay.portal.SystemException;

	public void registerListener(
		com.liferay.portal.model.ModelListener listener);

	public void unregisterListener(
		com.liferay.portal.model.ModelListener listener);
}