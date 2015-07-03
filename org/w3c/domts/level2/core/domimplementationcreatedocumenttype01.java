
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:



Copyright (c) 2001 World Wide Web Consortium, 
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University).  All 
Rights Reserved.  This program is distributed under the W3C's Software
Intellectual Property License.  This program is distributed in the 
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
PURPOSE.  

See W3C License http://www.w3.org/Consortium/Legal/ for more details.


*/

package org.w3c.domts.level2.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *  The method createDocumentType with valid values for qualifiedName, publicId and
 *  systemId should create an empty DocumentType node.
 *  
 *  Invoke createDocument on this DOMImplementation with a valid qualifiedName and different
 *  publicIds and systemIds.  Check if the the DocumentType node was created with its 
 *  ownerDocument attribute set to null.
* @author IBM
* @author Neil Delima
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#Level-2-Core-DOM-createDocument">http://www.w3.org/TR/DOM-Level-2-Core/core#Level-2-Core-DOM-createDocument</a>
*/
public final class domimplementationcreatedocumenttype01 extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public domimplementationcreatedocumenttype01(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staffNS", false);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      DOMImplementation domImpl;
      DocumentType newDocType;
      Document ownerDocument;
      String qualifiedName = "test:root";
      String publicId;
      String systemId;
      java.util.List publicIds = new java.util.ArrayList();
      publicIds.add("1234");
      publicIds.add("test");
      
      java.util.List systemIds = new java.util.ArrayList();
      systemIds.add("");
      systemIds.add("test");
      
      doc = (Document) load("staffNS", false);
      domImpl = doc.getImplementation();
      for (int indexN1005D = 0; indexN1005D < publicIds.size(); indexN1005D++) {
          publicId = (String) publicIds.get(indexN1005D);
    for (int indexN10061 = 0; indexN10061 < systemIds.size(); indexN10061++) {
          systemId = (String) systemIds.get(indexN10061);
    newDocType = domImpl.createDocumentType(qualifiedName, publicId, systemId);
      assertNotNull("domimplementationcreatedocumenttype01_newDocType", newDocType);
      ownerDocument = newDocType.getOwnerDocument();
      assertNull("domimplementationcreatedocumenttype01_ownerDocument", ownerDocument);
        }
        }
      }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level2/core/domimplementationcreatedocumenttype01";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(domimplementationcreatedocumenttype01.class, args);
   }
}

