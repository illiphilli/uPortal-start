/**
 * Copyright 2007 The JA-SIG Collaborative.  All rights reserved.
 * See license distributed with this file and
 * available online at http://www.uportal.org/license.html
 */
package org.jasig.portal.url;

import javax.servlet.http.HttpServletRequest;

import org.jasig.portal.portlet.om.IPortletWindowId;

/**
 * Generates URLs for the current request based on the portal or portlet URL objects and target ids.
 * 
 * @author Eric Dalquist
 * @version $Revision$
 */
public interface IUrlGenerator {
    /**
     * @param request The current request
     * @param basePortalUrl The URL object to create a URL string from
     * @param targetFolderId The targeted folder id from the user's layout
     * @return A URL to be used in markup or as a redirect. The URL will be absolute, starting with a / or with a protocol such as http://
     */
    public String generatePortalUrl(HttpServletRequest request, IBasePortalUrl basePortalUrl, String targetFolderId);
    
    /**
     * @param request The current request
     * @param portalPortletUrl The URL object to create a URL string from
     * @param portletWindowId The targeted portlet window ID
     * @return A URL to be used in markup or as a redirect. The URL will be absolute, starting with a / or with a protocol such as http://
     */
    public String generatePortletUrl(HttpServletRequest request, IPortalPortletUrl portalPortletUrl, IPortletWindowId portletWindowId);
}