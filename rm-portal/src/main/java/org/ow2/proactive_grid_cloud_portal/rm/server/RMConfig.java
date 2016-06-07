package org.ow2.proactive_grid_cloud_portal.rm.server;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lpellegr on 06/06/16.
 */
public class RMConfig extends org.ow2.proactive_grid_cloud_portal.rm.shared.RMConfig {

    public String getRestUrlFromServer(HttpServletRequest request) {
        String restUrlFromProperties = properties.get(REST_URL);

        if (restUrlFromProperties == null) {
            String host = request.getRemoteHost();
            String protocol = request.isSecure() ? "https" : "http";
            String port = Integer.toString(request.getRemotePort());
            return protocol + "://" + host + ":" + port + "/rest";
        } else if (restUrlFromProperties.startsWith(".")
                || restUrlFromProperties.startsWith("..")) {
            String host = request.getRemoteHost();
            String protocol = request.isSecure() ? "https" : "http";
            String port = Integer.toString(request.getRemotePort());
            return protocol + "://" + host + ":" + port + "/" + request.getContextPath() + "/" + restUrlFromProperties;
        } else {
            return restUrlFromProperties;
        }
    }

}
