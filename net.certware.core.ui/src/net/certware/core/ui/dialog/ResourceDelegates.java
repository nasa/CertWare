package net.certware.core.ui.dialog;

import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.core.resources.FileInfoMatcherDescription;
import org.eclipse.core.resources.IBuildConfiguration;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFileState;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IPathVariableManager;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceFilterDescription;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IPluginDescriptor;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.IContentTypeMatcher;
import org.eclipse.core.runtime.jobs.ISchedulingRule;



@SuppressWarnings("deprecation")
public class ResourceDelegates {

	static class FileDelegate implements IFile {
		private final ISelectionProvider fProvider;
		private final IFile fFile;

		public FileDelegate(IFile file, ISelectionProvider provider) {
			this.fFile = file;
			this.fProvider = provider;
		}

		public void accept(IResourceProxyVisitor visitor, int memberFlags) throws CoreException {
			fFile.accept(visitor, memberFlags);
		}

		public void accept(IResourceVisitor visitor, int depth, boolean includePhantoms) throws CoreException {
			fFile.accept(visitor, depth, includePhantoms);
		}

		public void accept(IResourceVisitor visitor, int depth, int memberFlags) throws CoreException {
			fFile.accept(visitor, depth, memberFlags);
		}

		public void accept(IResourceVisitor visitor) throws CoreException {
			fFile.accept(visitor);
		}

		public void appendContents(InputStream source, boolean force, boolean keepHistory, IProgressMonitor monitor)
				throws CoreException {
			fFile.appendContents(source, force, keepHistory, monitor);
		}

		public void appendContents(InputStream source, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.appendContents(source, updateFlags, monitor);
		}

		public void clearHistory(IProgressMonitor monitor) throws CoreException {
			fFile.clearHistory(monitor);
		}

		public boolean contains(ISchedulingRule rule) {
			return fFile.contains(rule);
		}

		public void copy(IPath destination, boolean force, IProgressMonitor monitor) throws CoreException {
			fFile.copy(destination, force, monitor);
		}

		public void copy(IPath destination, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.copy(destination, updateFlags, monitor);
		}

		public void copy(IProjectDescription description, boolean force, IProgressMonitor monitor) throws CoreException {
			fFile.copy(description, force, monitor);
		}

		public void copy(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.copy(description, updateFlags, monitor);
		}

		public void create(InputStream source, boolean force, IProgressMonitor monitor) throws CoreException {
			fFile.create(source, force, monitor);
		}

		public void create(InputStream source, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.create(source, updateFlags, monitor);
		}

		public void createLink(IPath localLocation, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.createLink(localLocation, updateFlags, monitor);
		}

		public void createLink(URI location, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.createLink(location, updateFlags, monitor);
		}

		public IMarker createMarker(String type) throws CoreException {
			return fFile.createMarker(type);
		}

		public IResourceProxy createProxy() {
			return fFile.createProxy();
		}

		public void delete(boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
			fFile.delete(force, keepHistory, monitor);
		}

		public void delete(boolean force, IProgressMonitor monitor) throws CoreException {
			fFile.delete(force, monitor);
		}

		public void delete(int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.delete(updateFlags, monitor);
		}

		public void deleteMarkers(String type, boolean includeSubtypes, int depth) throws CoreException {
			fFile.deleteMarkers(type, includeSubtypes, depth);
		}

		public boolean equals(Object other) {
			if (other instanceof FileDelegate)
				return fFile.equals(((FileDelegate) other).fFile);
			return fFile.equals(other);
		}

		public boolean exists() {
			return fFile.exists();
		}

		public IMarker findMarker(long id) throws CoreException {
			return fFile.findMarker(id);
		}

		public IMarker[] findMarkers(String type, boolean includeSubtypes, int depth) throws CoreException {
			return fFile.findMarkers(type, includeSubtypes, depth);
		}

		public int findMaxProblemSeverity(String type, boolean includeSubtypes, int depth) throws CoreException {
			return fFile.findMaxProblemSeverity(type, includeSubtypes, depth);
		}

		@SuppressWarnings("rawtypes")
		public Object getAdapter(Class adapter) {
			return fFile.getAdapter(adapter);
		}

		public String getCharset() throws CoreException {
			return fFile.getCharset();
		}

		public String getCharset(boolean checkImplicit) throws CoreException {
			return fFile.getCharset(checkImplicit);
		}

		public String getCharsetFor(Reader reader) throws CoreException {
			return fFile.getCharsetFor(reader);
		}

		public IContentDescription getContentDescription() throws CoreException {
			return fFile.getContentDescription();
		}

		public InputStream getContents() throws CoreException {
			return fFile.getContents();
		}

		public InputStream getContents(boolean force) throws CoreException {
			return fFile.getContents(force);
		}

		public int getEncoding() throws CoreException {
			return fFile.getEncoding();
		}

		public String getFileExtension() {
			return fFile.getFileExtension();
		}

		public IPath getFullPath() {
			return fFile.getFullPath();
		}

		public IFileState[] getHistory(IProgressMonitor monitor) throws CoreException {
			return fFile.getHistory(monitor);
		}

		public long getLocalTimeStamp() {
			return fFile.getLocalTimeStamp();
		}

		public IPath getLocation() {
			return fFile.getLocation();
		}

		public URI getLocationURI() {
			return fFile.getLocationURI();
		}

		public IMarker getMarker(long id) {
			return fFile.getMarker(id);
		}

		public long getModificationStamp() {
			return fFile.getModificationStamp();
		}

		public String getName() {
			return fFile.getName();
		}

		public IContainer getParent() {
			return ResourceDelegates.createContainer(fFile.getParent(), fProvider);
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Map getPersistentProperties() throws CoreException {
			return fFile.getPersistentProperties();
		}

		public String getPersistentProperty(QualifiedName key) throws CoreException {
			return fFile.getPersistentProperty(key);
		}

		public IProject getProject() {
			return ResourceDelegates.createProject(fFile.getProject(), fProvider);
		}

		public IPath getProjectRelativePath() {
			return fFile.getProjectRelativePath();
		}

		public IPath getRawLocation() {
			return fFile.getRawLocation();
		}

		public URI getRawLocationURI() {
			return fFile.getRawLocationURI();
		}

		public ResourceAttributes getResourceAttributes() {
			return fFile.getResourceAttributes();
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Map getSessionProperties() throws CoreException {
			return fFile.getSessionProperties();
		}

		public Object getSessionProperty(QualifiedName key) throws CoreException {
			return fFile.getSessionProperty(key);
		}

		public int getType() {
			return fFile.getType();
		}

		public IWorkspace getWorkspace() {
			return fFile.getWorkspace();
		}

		public boolean isAccessible() {
			return fFile.isAccessible();
		}

		public boolean isConflicting(ISchedulingRule rule) {
			return fFile.isConflicting(rule);
		}

		public boolean isDerived() {
			return fFile.isDerived();
		}

		public boolean isDerived(int options) {
			return fFile.isDerived(options);
		}

		public boolean isHidden() {
			return fFile.isHidden();
		}

		public boolean isLinked() {
			return fFile.isLinked();
		}

		public boolean isLinked(int options) {
			return fFile.isLinked(options);
		}

		public boolean isLocal(int depth) {
			return fFile.isLocal(depth);
		}

		public boolean isPhantom() {
			return fFile.isPhantom();
		}

		public boolean isReadOnly() {
			return fFile.isReadOnly();
		}

		public boolean isSynchronized(int depth) {
			return fFile.isSynchronized(depth);
		}

		public boolean isTeamPrivateMember() {
			return fFile.isTeamPrivateMember();
		}

		public void move(IPath destination, boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
			fFile.move(destination, force, keepHistory, monitor);
		}

		public void move(IPath destination, boolean force, IProgressMonitor monitor) throws CoreException {
			fFile.move(destination, force, monitor);
		}

		public void move(IPath destination, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.move(destination, updateFlags, monitor);
		}

		public void move(IProjectDescription description, boolean force, boolean keepHistory, IProgressMonitor monitor)
				throws CoreException {
			fFile.move(description, force, keepHistory, monitor);
		}

		public void move(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.move(description, updateFlags, monitor);
		}

		public void refreshLocal(int depth, IProgressMonitor monitor) throws CoreException {
			fFile.refreshLocal(depth, monitor);
		}

		public void revertModificationStamp(long value) throws CoreException {
			fFile.revertModificationStamp(value);
		}

		public void setCharset(String newCharset, IProgressMonitor monitor) throws CoreException {
			fFile.setCharset(newCharset, monitor);
		}

		public void setCharset(String newCharset) throws CoreException {
			fFile.setCharset(newCharset);
		}

		public void setContents(IFileState source, boolean force, boolean keepHistory, IProgressMonitor monitor)
				throws CoreException {
			fFile.setContents(source, force, keepHistory, monitor);
		}

		public void setContents(IFileState source, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.setContents(source, updateFlags, monitor);
		}

		public void setContents(InputStream source, boolean force, boolean keepHistory, IProgressMonitor monitor)
				throws CoreException {
			fFile.setContents(source, force, keepHistory, monitor);
		}

		public void setContents(InputStream source, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFile.setContents(source, updateFlags, monitor);
		}

		public void setDerived(boolean isDerived) throws CoreException {
			fFile.setDerived(isDerived);
		}

		public void setHidden(boolean isHidden) throws CoreException {
			fFile.setHidden(isHidden);
		}

		public void setLocal(boolean flag, int depth, IProgressMonitor monitor) throws CoreException {
			fFile.setLocal(flag, depth, monitor);
		}

		public long setLocalTimeStamp(long value) throws CoreException {
			return fFile.setLocalTimeStamp(value);
		}

		public void setPersistentProperty(QualifiedName key, String value) throws CoreException {
			fFile.setPersistentProperty(key, value);
		}

		public void setReadOnly(boolean readOnly) {
			fFile.setReadOnly(readOnly);
		}

		public void setResourceAttributes(ResourceAttributes attributes) throws CoreException {
			fFile.setResourceAttributes(attributes);
		}

		public void setSessionProperty(QualifiedName key, Object value) throws CoreException {
			fFile.setSessionProperty(key, value);
		}

		public void setTeamPrivateMember(boolean isTeamPrivate) throws CoreException {
			fFile.setTeamPrivateMember(isTeamPrivate);
		}

		public void touch(IProgressMonitor monitor) throws CoreException {
			fFile.touch(monitor);
		}

		@Override
		public IPathVariableManager getPathVariableManager() {
			return fFile.getPathVariableManager();
		}

		@Override
		public boolean isHidden(int options) {
			return fFile.isHidden(options);
		}

		@Override
		public boolean isVirtual() {
			return fFile.isVirtual();
		}

		@Override
		public boolean isTeamPrivateMember(int options) {
			return fFile.isTeamPrivateMember(options);
		}

		@Override
		public void setDerived(boolean isDerived, IProgressMonitor monitor)
				throws CoreException {
			fFile.setDerived(isDerived, monitor);
		}

		@Override
		public void accept(IResourceProxyVisitor visitor, int depth,
				int memberFlags) throws CoreException {
			// TODO Auto-generated method stub
			
		}
	}
	
	static class FolderDelegate implements IFolder {
		private final ISelectionProvider fProvider;
		private final IFolder fFolder;

		public FolderDelegate(IFolder folder, ISelectionProvider provider) {
			this.fFolder = folder;
			this.fProvider = provider;
			
		}

		public void accept(IResourceProxyVisitor visitor, int memberFlags) throws CoreException {
			fFolder.accept(visitor, memberFlags);
		}

		public void accept(IResourceVisitor visitor, int depth, boolean includePhantoms) throws CoreException {
			fFolder.accept(visitor, depth, includePhantoms);
		}

		public void accept(IResourceVisitor visitor, int depth, int memberFlags) throws CoreException {
			fFolder.accept(visitor, depth, memberFlags);
		}

		public void accept(IResourceVisitor visitor) throws CoreException {
			fFolder.accept(visitor);
		}

		public void clearHistory(IProgressMonitor monitor) throws CoreException {
			fFolder.clearHistory(monitor);
		}

		public boolean contains(ISchedulingRule rule) {
			return fFolder.contains(rule);
		}

		public void copy(IPath destination, boolean force, IProgressMonitor monitor) throws CoreException {
			fFolder.copy(destination, force, monitor);
		}

		public void copy(IPath destination, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFolder.copy(destination, updateFlags, monitor);
		}

		public void copy(IProjectDescription description, boolean force, IProgressMonitor monitor) throws CoreException {
			fFolder.copy(description, force, monitor);
		}

		public void copy(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFolder.copy(description, updateFlags, monitor);
		}

		public void create(boolean force, boolean local, IProgressMonitor monitor) throws CoreException {
			fFolder.create(force, local, monitor);
		}

		public void create(int updateFlags, boolean local, IProgressMonitor monitor) throws CoreException {
			fFolder.create(updateFlags, local, monitor);
		}

		public void createLink(IPath localLocation, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFolder.createLink(localLocation, updateFlags, monitor);
		}

		public void createLink(URI location, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFolder.createLink(location, updateFlags, monitor);
		}

		public IMarker createMarker(String type) throws CoreException {
			return fFolder.createMarker(type);
		}

		public IResourceProxy createProxy() {
			return fFolder.createProxy();
		}

		public void delete(boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
			fFolder.delete(force, keepHistory, monitor);
		}

		public void delete(boolean force, IProgressMonitor monitor) throws CoreException {
			fFolder.delete(force, monitor);
		}

		public void delete(int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFolder.delete(updateFlags, monitor);
		}

		public void deleteMarkers(String type, boolean includeSubtypes, int depth) throws CoreException {
			fFolder.deleteMarkers(type, includeSubtypes, depth);
		}

		public boolean equals(Object other) {
			if (other instanceof FolderDelegate)
				return fFolder.equals(((FolderDelegate) other).fFolder);
			return fFolder.equals(other);
		}

		public boolean exists() {
			return fFolder.exists();
		}

		public boolean exists(IPath path) {
			return fFolder.exists(path);
		}

		public IFile[] findDeletedMembersWithHistory(int depth, IProgressMonitor monitor) throws CoreException {
			return ResourceDelegates.createFiles(fFolder.findDeletedMembersWithHistory(depth, monitor), fProvider);
		}

		public IMarker findMarker(long id) throws CoreException {
			return fFolder.findMarker(id);
		}

		public IMarker[] findMarkers(String type, boolean includeSubtypes, int depth) throws CoreException {
			return fFolder.findMarkers(type, includeSubtypes, depth);
		}

		public int findMaxProblemSeverity(String type, boolean includeSubtypes, int depth) throws CoreException {
			return fFolder.findMaxProblemSeverity(type, includeSubtypes, depth);
		}

		public IResource findMember(IPath path, boolean includePhantoms) {
			return ResourceDelegates.createResource(fFolder.findMember(path, includePhantoms), fProvider);
		}

		public IResource findMember(IPath path) {
			return ResourceDelegates.createResource(fFolder.findMember(path), fProvider);
		}

		public IResource findMember(String name, boolean includePhantoms) {
			return ResourceDelegates.createResource(fFolder.findMember(name, includePhantoms), fProvider);
		}

		public IResource findMember(String name) {
			return ResourceDelegates.createResource(fFolder.findMember(name), fProvider);
		}

		@SuppressWarnings("rawtypes")
		public Object getAdapter(Class adapter) {
			return fFolder.getAdapter(adapter);
		}

		public String getDefaultCharset() throws CoreException {
			return fFolder.getDefaultCharset();
		}

		public String getDefaultCharset(boolean checkImplicit) throws CoreException {
			return fFolder.getDefaultCharset(checkImplicit);
		}

		public IFile getFile(IPath path) {
			return ResourceDelegates.createFile(fFolder.getFile(path), fProvider);
		}

		public IFile getFile(String name) {
			return ResourceDelegates.createFile(fFolder.getFile(name), fProvider);
		}

		public String getFileExtension() {
			return fFolder.getFileExtension();
		}

		public IFolder getFolder(IPath path) {
			return ResourceDelegates.createFolder(fFolder.getFolder(path), fProvider);
		}

		public IFolder getFolder(String name) {
			return ResourceDelegates.createFolder(fFolder.getFolder(name), fProvider);
		}

		public IPath getFullPath() {
			return fFolder.getFullPath();
		}

		public long getLocalTimeStamp() {
			return fFolder.getLocalTimeStamp();
		}

		public IPath getLocation() {
			return fFolder.getLocation();
		}

		public URI getLocationURI() {
			return fFolder.getLocationURI();
		}

		public IMarker getMarker(long id) {
			return fFolder.getMarker(id);
		}

		public long getModificationStamp() {
			return fFolder.getModificationStamp();
		}

		public String getName() {
			return fFolder.getName();
		}

		public IContainer getParent() {
			if (this.equals(fProvider.getRoot()))
					return null ;
			return ResourceDelegates.createContainer(fFolder.getParent(), fProvider);
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Map getPersistentProperties() throws CoreException {
			return fFolder.getPersistentProperties();
		}

		public String getPersistentProperty(QualifiedName key) throws CoreException {
			return fFolder.getPersistentProperty(key);
		}

		public IProject getProject() {
			return ResourceDelegates.createProject(fFolder.getProject(), fProvider);
		}

		public IPath getProjectRelativePath() {
			return fFolder.getProjectRelativePath();
		}

		public IPath getRawLocation() {
			return fFolder.getRawLocation();
		}

		public URI getRawLocationURI() {
			return fFolder.getRawLocationURI();
		}

		public ResourceAttributes getResourceAttributes() {
			return fFolder.getResourceAttributes();
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Map getSessionProperties() throws CoreException {
			return fFolder.getSessionProperties();
		}

		public Object getSessionProperty(QualifiedName key) throws CoreException {
			return fFolder.getSessionProperty(key);
		}

		public int getType() {
			return fFolder.getType();
		}

		public IWorkspace getWorkspace() {
			return fFolder.getWorkspace();
		}

		public boolean isAccessible() {
			return fFolder.isAccessible();
		}

		public boolean isConflicting(ISchedulingRule rule) {
			return fFolder.isConflicting(rule);
		}

		public boolean isDerived() {
			return fFolder.isDerived();
		}

		public boolean isDerived(int options) {
			return fFolder.isDerived(options);
		}

		public boolean isHidden() {
			return fFolder.isHidden();
		}

		public boolean isLinked() {
			return fFolder.isLinked();
		}

		public boolean isLinked(int options) {
			return fFolder.isLinked(options);
		}

		public boolean isLocal(int depth) {
			return fFolder.isLocal(depth);
		}

		public boolean isPhantom() {
			return fFolder.isPhantom();
		}

		public boolean isReadOnly() {
			return fFolder.isReadOnly();
		}

		public boolean isSynchronized(int depth) {
			return fFolder.isSynchronized(depth);
		}

		public boolean isTeamPrivateMember() {
			return fFolder.isTeamPrivateMember();
		}

		public IResource[] members() throws CoreException {
			return ResourceDelegates.createResources(fFolder.members(), fProvider);
		}

		public IResource[] members(boolean includePhantoms) throws CoreException {
			return ResourceDelegates.createResources(fFolder.members(includePhantoms), fProvider);
		}

		public IResource[] members(int memberFlags) throws CoreException {
			return ResourceDelegates.createResources(fFolder.members(memberFlags), fProvider);
		}

		public void move(IPath destination, boolean force, boolean keepHistory, IProgressMonitor monitor) throws CoreException {
			fFolder.move(destination, force, keepHistory, monitor);
		}

		public void move(IPath destination, boolean force, IProgressMonitor monitor) throws CoreException {
			fFolder.move(destination, force, monitor);
		}

		public void move(IPath destination, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFolder.move(destination, updateFlags, monitor);
		}

		public void move(IProjectDescription description, boolean force, boolean keepHistory, IProgressMonitor monitor)
				throws CoreException {
			fFolder.move(description, force, keepHistory, monitor);
		}

		public void move(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fFolder.move(description, updateFlags, monitor);
		}

		public void refreshLocal(int depth, IProgressMonitor monitor) throws CoreException {
			fFolder.refreshLocal(depth, monitor);
		}

		public void revertModificationStamp(long value) throws CoreException {
			fFolder.revertModificationStamp(value);
		}

		public void setDefaultCharset(String charset, IProgressMonitor monitor) throws CoreException {
			fFolder.setDefaultCharset(charset, monitor);
		}

		public void setDefaultCharset(String charset) throws CoreException {
			fFolder.setDefaultCharset(charset);
		}

		public void setDerived(boolean isDerived) throws CoreException {
			fFolder.setDerived(isDerived);
		}

		public void setHidden(boolean isHidden) throws CoreException {
			fFolder.setHidden(isHidden);
		}

		public void setLocal(boolean flag, int depth, IProgressMonitor monitor) throws CoreException {
			fFolder.setLocal(flag, depth, monitor);
		}

		public long setLocalTimeStamp(long value) throws CoreException {
			return fFolder.setLocalTimeStamp(value);
		}

		public void setPersistentProperty(QualifiedName key, String value) throws CoreException {
			fFolder.setPersistentProperty(key, value);
		}

		public void setReadOnly(boolean readOnly) {
			fFolder.setReadOnly(readOnly);
		}

		public void setResourceAttributes(ResourceAttributes attributes) throws CoreException {
			fFolder.setResourceAttributes(attributes);
		}

		public void setSessionProperty(QualifiedName key, Object value) throws CoreException {
			fFolder.setSessionProperty(key, value);
		}

		public void setTeamPrivateMember(boolean isTeamPrivate) throws CoreException {
			fFolder.setTeamPrivateMember(isTeamPrivate);
		}

		public void touch(IProgressMonitor monitor) throws CoreException {
			fFolder.touch(monitor);
		}

		@Override
		public IResourceFilterDescription createFilter(int type,
				FileInfoMatcherDescription matcherDescription, int updateFlags,
				IProgressMonitor monitor) throws CoreException {
			return fFolder.createFilter(type, matcherDescription, updateFlags, monitor);
		}

		@Override
		public IResourceFilterDescription[] getFilters() throws CoreException {
			return fFolder.getFilters();
		}

		@Override
		public IPathVariableManager getPathVariableManager() {
			return fFolder.getPathVariableManager();
		}

		@Override
		public boolean isHidden(int options) {
			return fFolder.isHidden(options);
		}

		@Override
		public boolean isVirtual() {
			return fFolder.isVirtual();
		}

		@Override
		public boolean isTeamPrivateMember(int options) {
			return fFolder.isTeamPrivateMember(options);
		}

		@Override
		public void setDerived(boolean isDerived, IProgressMonitor monitor)
				throws CoreException {
			fFolder.setDerived(isDerived, monitor);
		}

		@Override
		public void accept(IResourceProxyVisitor visitor, int depth,
				int memberFlags) throws CoreException {
			// TODO Auto-generated method stub
			
		}
	}
	
	static class ProjectDelegate implements IProject {
		private final ISelectionProvider fProvider;
		private final IProject fProject;

		public ProjectDelegate (IProject project, ISelectionProvider provider) {
			this.fProject = project;
			this.fProvider = provider;
		}

		public void accept(IResourceProxyVisitor visitor, int memberFlags) throws CoreException {
			fProject.accept(visitor, memberFlags);
		}

		public void accept(IResourceVisitor visitor, int depth, boolean includePhantoms) throws CoreException {
			fProject.accept(visitor, depth, includePhantoms);
		}

		public void accept(IResourceVisitor visitor, int depth, int memberFlags) throws CoreException {
			fProject.accept(visitor, depth, memberFlags);
		}

		public void accept(IResourceVisitor visitor) throws CoreException {
			fProject.accept(visitor);
		}

		public void build(int kind, IProgressMonitor monitor) throws CoreException {
			fProject.build(kind, monitor);
		}

		public void build(int kind, String builderName, Map<String,String> args, IProgressMonitor monitor) throws CoreException {
			fProject.build(kind, builderName, args, monitor);
		}
		
		public void clearHistory(IProgressMonitor monitor) throws CoreException {
			fProject.clearHistory(monitor);
		}

		public void close(IProgressMonitor monitor) throws CoreException {
			fProject.close(monitor);
		}

		public boolean contains(ISchedulingRule rule) {
			return fProject.contains(rule);
		}

		public void copy(IPath destination, boolean force, IProgressMonitor monitor) throws CoreException {
			fProject.copy(destination, force, monitor);
		}

		public void copy(IPath destination, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fProject.copy(destination, updateFlags, monitor);
		}

		public void copy(IProjectDescription description, boolean force, IProgressMonitor monitor) throws CoreException {
			fProject.copy(description, force, monitor);
		}

		public void copy(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fProject.copy(description, updateFlags, monitor);
		}

		public void create(IProgressMonitor monitor) throws CoreException {
			fProject.create(monitor);
		}

		public void create(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fProject.create(description, updateFlags, monitor);
		}

		public void create(IProjectDescription description, IProgressMonitor monitor) throws CoreException {
			fProject.create(description, monitor);
		}

		public IMarker createMarker(String type) throws CoreException {
			return fProject.createMarker(type);
		}

		public IResourceProxy createProxy() {
			return fProject.createProxy();
		}

		public void delete(boolean deleteContent, boolean force, IProgressMonitor monitor) throws CoreException {
			fProject.delete(deleteContent, force, monitor);
		}

		public void delete(boolean force, IProgressMonitor monitor) throws CoreException {
			fProject.delete(force, monitor);
		}

		public void delete(int updateFlags, IProgressMonitor monitor) throws CoreException {
			fProject.delete(updateFlags, monitor);
		}

		public void deleteMarkers(String type, boolean includeSubtypes, int depth) throws CoreException {
			fProject.deleteMarkers(type, includeSubtypes, depth);
		}

		public boolean equals(Object other) {
			if (other instanceof ProjectDelegate)
				return fProject.equals(((ProjectDelegate) other).fProject);
			return fProject.equals(other);
		}

		public boolean exists() {
			return fProject.exists();
		}

		public boolean exists(IPath path) {
			return fProject.exists(path);
		}

		public IFile[] findDeletedMembersWithHistory(int depth, IProgressMonitor monitor) throws CoreException {
			return ResourceDelegates.createFiles(fProject.findDeletedMembersWithHistory(depth, monitor), fProvider);
		}

		public IMarker findMarker(long id) throws CoreException {
			return fProject.findMarker(id);
		}

		public IMarker[] findMarkers(String type, boolean includeSubtypes, int depth) throws CoreException {
			return fProject.findMarkers(type, includeSubtypes, depth);
		}

		public int findMaxProblemSeverity(String type, boolean includeSubtypes, int depth) throws CoreException {
			return fProject.findMaxProblemSeverity(type, includeSubtypes, depth);
		}

		public IResource findMember(IPath path, boolean includePhantoms) {
			return ResourceDelegates.createResource(fProject.findMember(path, includePhantoms), fProvider);
		}

		public IResource findMember(IPath path) {
			return ResourceDelegates.createResource(fProject.findMember(path), fProvider);
		}

		public IResource findMember(String name, boolean includePhantoms) {
			return ResourceDelegates.createResource(fProject.findMember(name, includePhantoms), fProvider);
		}

		public IResource findMember(String name) {
			return ResourceDelegates.createResource(fProject.findMember(name), fProvider);
		}

		@SuppressWarnings("rawtypes")
		public Object getAdapter(Class adapter) {
			return fProject.getAdapter(adapter);
		}

		public IContentTypeMatcher getContentTypeMatcher() throws CoreException {
			return fProject.getContentTypeMatcher();
		}

		public String getDefaultCharset() throws CoreException {
			return fProject.getDefaultCharset();
		}

		public String getDefaultCharset(boolean checkImplicit) throws CoreException {
			return fProject.getDefaultCharset(checkImplicit);
		}

		public IProjectDescription getDescription() throws CoreException {
			return fProject.getDescription();
		}

		public IFile getFile(IPath path) {
			return ResourceDelegates.createFile(fProject.getFile(path), fProvider);
		}

		public IFile getFile(String name) {
			return ResourceDelegates.createFile(fProject.getFile(name), fProvider);
		}

		public String getFileExtension() {
			return fProject.getFileExtension();
		}

		public IFolder getFolder(IPath path) {
			return ResourceDelegates.createFolder(fProject.getFolder(path), fProvider);
		}

		public IFolder getFolder(String name) {
			return ResourceDelegates.createFolder(fProject.getFolder(name), fProvider);
		}

		public IPath getFullPath() {
			return fProject.getFullPath();
		}

		public long getLocalTimeStamp() {
			return fProject.getLocalTimeStamp();
		}

		public IPath getLocation() {
			return fProject.getLocation();
		}

		public URI getLocationURI() {
			return fProject.getLocationURI();
		}

		public IMarker getMarker(long id) {
			return fProject.getMarker(id);
		}

		public long getModificationStamp() {
			return fProject.getModificationStamp();
		}

		public String getName() {
			return fProject.getName();
		}

		public IProjectNature getNature(String natureId) throws CoreException {
			return fProject.getNature(natureId);
		}

		public IContainer getParent() {
			if (this.equals(fProvider.getRoot()))
				return null ;
			return ResourceDelegates.createContainer(fProject.getParent(), fProvider);
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Map getPersistentProperties() throws CoreException {
			return fProject.getPersistentProperties();
		}

		public String getPersistentProperty(QualifiedName key) throws CoreException {
			return fProject.getPersistentProperty(key);
		}

		public IPath getPluginWorkingLocation(IPluginDescriptor plugin) {
			return fProject.getPluginWorkingLocation(plugin);
		}

		public IProject getProject() {
			return ResourceDelegates.createProject(fProject.getProject(), fProvider);
		}

		public IPath getProjectRelativePath() {
			return fProject.getProjectRelativePath();
		}

		public IPath getRawLocation() {
			return fProject.getRawLocation();
		}

		public URI getRawLocationURI() {
			return fProject.getRawLocationURI();
		}

		public IProject[] getReferencedProjects() throws CoreException {
			return ResourceDelegates.createProjects(fProject.getReferencedProjects(), fProvider);
		}

		public IProject[] getReferencingProjects() {
			return fProject.getReferencingProjects();
		}

		public ResourceAttributes getResourceAttributes() {
			return fProject.getResourceAttributes();
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Map getSessionProperties() throws CoreException {
			return fProject.getSessionProperties();
		}

		public Object getSessionProperty(QualifiedName key) throws CoreException {
			return fProject.getSessionProperty(key);
		}

		public int getType() {
			return fProject.getType();
		}

		public IPath getWorkingLocation(String id) {
			return fProject.getWorkingLocation(id);
		}

		public IWorkspace getWorkspace() {
			return fProject.getWorkspace();
		}

		public boolean hasNature(String natureId) throws CoreException {
			return fProject.hasNature(natureId);
		}

		public boolean isAccessible() {
			return fProject.isAccessible();
		}

		public boolean isConflicting(ISchedulingRule rule) {
			return fProject.isConflicting(rule);
		}

		public boolean isDerived() {
			return fProject.isDerived();
		}

		public boolean isDerived(int options) {
			return fProject.isDerived(options);
		}

		public boolean isHidden() {
			return fProject.isHidden();
		}

		public boolean isLinked() {
			return fProject.isLinked();
		}

		public boolean isLinked(int options) {
			return fProject.isLinked(options);
		}

		public boolean isLocal(int depth) {
			return fProject.isLocal(depth);
		}

		public boolean isNatureEnabled(String natureId) throws CoreException {
			return fProject.isNatureEnabled(natureId);
		}

		public boolean isOpen() {
			return fProject.isOpen();
		}

		public boolean isPhantom() {
			return fProject.isPhantom();
		}

		public boolean isReadOnly() {
			return fProject.isReadOnly();
		}

		public boolean isSynchronized(int depth) {
			return fProject.isSynchronized(depth);
		}

		public boolean isTeamPrivateMember() {
			return fProject.isTeamPrivateMember();
		}

		public IResource[] members() throws CoreException {
			return ResourceDelegates.createResources(fProject.members(), fProvider);
		}

		public IResource[] members(boolean includePhantoms) throws CoreException {
			return ResourceDelegates.createResources(fProject.members(includePhantoms), fProvider);
		}

		public IResource[] members(int memberFlags) throws CoreException {
			return ResourceDelegates.createResources(fProject.members(memberFlags), fProvider);
		}

		public void move(IPath destination, boolean force, IProgressMonitor monitor) throws CoreException {
			fProject.move(destination, force, monitor);
		}

		public void move(IPath destination, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fProject.move(destination, updateFlags, monitor);
		}

		public void move(IProjectDescription description, boolean force, boolean keepHistory, IProgressMonitor monitor)
				throws CoreException {
			fProject.move(description, force, keepHistory, monitor);
		}

		public void move(IProjectDescription description, boolean force, IProgressMonitor monitor) throws CoreException {
			fProject.move(description, force, monitor);
		}

		public void move(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fProject.move(description, updateFlags, monitor);
		}

		public void open(int updateFlags, IProgressMonitor monitor) throws CoreException {
			fProject.open(updateFlags, monitor);
		}

		public void open(IProgressMonitor monitor) throws CoreException {
			fProject.open(monitor);
		}

		public void refreshLocal(int depth, IProgressMonitor monitor) throws CoreException {
			fProject.refreshLocal(depth, monitor);
		}

		public void revertModificationStamp(long value) throws CoreException {
			fProject.revertModificationStamp(value);
		}

		public void setDefaultCharset(String charset, IProgressMonitor monitor) throws CoreException {
			fProject.setDefaultCharset(charset, monitor);
		}

		public void setDefaultCharset(String charset) throws CoreException {
			fProject.setDefaultCharset(charset);
		}

		public void setDerived(boolean isDerived) throws CoreException {
			fProject.setDerived(isDerived);
		}

		public void setDescription(IProjectDescription description, int updateFlags, IProgressMonitor monitor) throws CoreException {
			fProject.setDescription(description, updateFlags, monitor);
		}

		public void setDescription(IProjectDescription description, IProgressMonitor monitor) throws CoreException {
			fProject.setDescription(description, monitor);
		}

		public void setHidden(boolean isHidden) throws CoreException {
			fProject.setHidden(isHidden);
		}

		public void setLocal(boolean flag, int depth, IProgressMonitor monitor) throws CoreException {
			fProject.setLocal(flag, depth, monitor);
		}

		public long setLocalTimeStamp(long value) throws CoreException {
			return fProject.setLocalTimeStamp(value);
		}

		public void setPersistentProperty(QualifiedName key, String value) throws CoreException {
			fProject.setPersistentProperty(key, value);
		}

		public void setReadOnly(boolean readOnly) {
			fProject.setReadOnly(readOnly);
		}

		public void setResourceAttributes(ResourceAttributes attributes) throws CoreException {
			fProject.setResourceAttributes(attributes);
		}

		public void setSessionProperty(QualifiedName key, Object value) throws CoreException {
			fProject.setSessionProperty(key, value);
		}

		public void setTeamPrivateMember(boolean isTeamPrivate) throws CoreException {
			fProject.setTeamPrivateMember(isTeamPrivate);
		}

		public void touch(IProgressMonitor monitor) throws CoreException {
			fProject.touch(monitor);
		}

		@Override
		public IResourceFilterDescription createFilter(int type,
				FileInfoMatcherDescription matcherDescription, int updateFlags,
				IProgressMonitor monitor) throws CoreException {
			return fProject.createFilter(type, matcherDescription, updateFlags, monitor);
		}

		@Override
		public IResourceFilterDescription[] getFilters() throws CoreException {
			return fProject.getFilters();
		}

		@Override
		public IPathVariableManager getPathVariableManager() {
			return fProject.getPathVariableManager();
		}

		@Override
		public boolean isHidden(int options) {
			return fProject.isHidden(options);
		}

		@Override
		public boolean isVirtual() {
			return fProject.isVirtual();
		}

		@Override
		public boolean isTeamPrivateMember(int options) {
			return fProject.isTeamPrivateMember(options);
		}

		@Override
		public void setDerived(boolean isDerived, IProgressMonitor monitor)
				throws CoreException {
			fProject.setDerived(isDerived, monitor);
		}

		@Override
		public void loadSnapshot(int options, URI snapshotLocation,
				IProgressMonitor monitor) throws CoreException {
			fProject.loadSnapshot(options, snapshotLocation, monitor);
		}

		@Override
		public void saveSnapshot(int options, URI snapshotLocation,
				IProgressMonitor monitor) throws CoreException {
			fProject.saveSnapshot(options, snapshotLocation, monitor);
		}

		@Override
		public void build(IBuildConfiguration config, int kind,
				IProgressMonitor monitor) throws CoreException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public IBuildConfiguration getActiveBuildConfig() throws CoreException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IBuildConfiguration getBuildConfig(String configName)
				throws CoreException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IBuildConfiguration[] getBuildConfigs() throws CoreException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IBuildConfiguration[] getReferencedBuildConfigs(
				String configName, boolean includeMissing) throws CoreException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean hasBuildConfig(String configName) throws CoreException {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void accept(IResourceProxyVisitor visitor, int depth,
				int memberFlags) throws CoreException {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static IAdaptable createAdaptable(IAdaptable rootElement, ISelectionProvider provider) {
		if (rootElement instanceof IFolder)
			return new FolderDelegate((IFolder) rootElement, provider);
		else if (rootElement instanceof IProject)
			return new ProjectDelegate((IProject) rootElement, provider);
		else if (rootElement instanceof IFile)
			return new FileDelegate((IFile) rootElement, provider);
		return rootElement;
	}

	public static IResource[] createResources(IResource[] members, ISelectionProvider provider) {
		if (members == null)
			return null ;
		ArrayList<IResource> delegates = new ArrayList<IResource>();
		for (int i = 0; i < members.length; i++) {
			if (provider.isValid(members[i]))
				delegates.add(createResource(members[i], provider));
		}
		return delegates.toArray(new IResource[delegates.size()]);
	}

	public static IResource createResource(IResource resource, ISelectionProvider provider) {
		if (resource == null || !provider.isValid(resource))
			return null;
		if (resource instanceof IProject)
			return createProject((IProject) resource, provider);
		else if (resource instanceof IFolder)
			return createFolder((IFolder) resource, provider);
		else if (resource instanceof IProject)
			return createProject((IProject) resource, provider);
		return resource ;
	}

	public static IProject[] createProjects(IProject[] referencedProjects, ISelectionProvider provider) {
		if (referencedProjects == null)
			return null ;
		ArrayList<ProjectDelegate> delegates = new ArrayList<ProjectDelegate>();
		for (int i = 0; i < referencedProjects.length; i++) {
			if (provider.isValid(referencedProjects[i]))
				delegates.add(new ProjectDelegate(referencedProjects[i], provider));
		}
		return delegates.toArray(new IProject[delegates.size()]);
	}

	public static IProject createProject(IProject project, ISelectionProvider provider) {
		if (project == null || !provider.isValid(project))
			return null;
		return new ProjectDelegate(project, provider);
	}

	public static IFolder createFolder(IFolder folder, ISelectionProvider provider) {
		if (folder == null || !provider.isValid(folder))
			return null ;
		return new FolderDelegate(folder, provider);
	}

	public static IFile createFile(IFile file, ISelectionProvider provider) {
		if (file == null || !provider.isValid(file))
			return null;
		return new FileDelegate(file, provider);
	}

	public static IFile[] createFiles(IFile[] files, ISelectionProvider provider) {
		if (files == null)
			return null ;
		ArrayList<FileDelegate> delegates = new ArrayList<FileDelegate>();
		for (int i = 0; i < files.length; i++) {
			if (provider.isValid(files[i]))
				delegates.add(new FileDelegate(files[i], provider));
		}
		return delegates.toArray(new IFile[delegates.size()]);
	}

	public static IContainer createContainer(IContainer parent, ISelectionProvider provider) {
		if (parent == null)
			return null ;
		if (parent instanceof IFolder)
			return new FolderDelegate((IFolder)parent, provider);
		else if (parent instanceof IProject)
			return new ProjectDelegate((IProject)parent, provider);
		return parent;
	}
}